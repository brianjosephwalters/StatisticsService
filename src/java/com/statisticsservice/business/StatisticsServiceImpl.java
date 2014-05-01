/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.statisticsservice.business;

import com.statisticsservice.certificateservice.Certificate;
import com.statisticsservice.certificateservice.NonexistentCertificateException_Exception;
import com.statisticsservice.courseservice.Course;
import com.statisticsservice.courseservice.NonexistentCourseException_Exception;
import com.statisticsservice.db.StatisticsDB;
import com.statisticsservice.dolservices.NonexistentOccupationException_Exception;
import com.statisticsservice.dolservices.NonexistentSkillException_Exception;
import com.statisticsservice.dolservices.Occupation;
import com.statisticsservice.dolservices.Skill;
import com.statisticsservice.exceptions.NonexistentCertificateException;
import com.statisticsservice.exceptions.NonexistentCourseException;
import com.statisticsservice.exceptions.NonexistentOccupationException;
import com.statisticsservice.exceptions.NonexistentSkillException;
import com.statisticsservice.queries.StatisticsQueries;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class StatisticsServiceImpl {

    private void stopAutoCommit(Connection connection) {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Could not set connection to autocommit");
            e.printStackTrace();
        }
    }
    
    private void commit(Connection connection) {
        try {
            connection.commit();
        } catch (SQLException e) {
            System.out.println("Could not commit connection");
            e.printStackTrace();
        }
    }
    
    private boolean isValidOccupation(String occupationID) {
        Occupation occupation = null;
        try {
            occupation = getOccupation(occupationID);
        } catch (NonexistentOccupationException_Exception e) {
            return false;
        }
        if (occupation == null) {
            return false;
        }
        return true;
    }
    
    private boolean isValidSkill(String skillID) {
        Skill skill = null;
        try {
            skill = getSkill(skillID);
        } catch (NonexistentSkillException_Exception e) {
            return false;
        }
        if (skill == null) {
            return false;
        }
        return true;
    }
    
    private boolean isValidCourse(String courseCode) {
        Course course = null;
        try {
            course = getCourse(courseCode);
        } catch (NonexistentCourseException_Exception e) {
            return false;
        }
        if (course == null) {
            return false;
        }
        return true;
    }
    
    public boolean isValidCertificate(String certificateCode) {
        Certificate certificate = null;
        try {
            certificate = getCertificate(certificateCode);
        } catch (NonexistentCertificateException_Exception e) {
            return false;
        }
        
        if (certificate == null) {
            return false;
        }
        return true;
    }
        
    public void incrementOccupation(String occupationID) 
            throws NonexistentOccupationException {
    
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        Integer count = 0;
        
        // Validate OccupationID
        if (!isValidOccupation(occupationID)) {
            throw new NonexistentOccupationException(occupationID);
        }
        
        stopAutoCommit(connection);       
        
        try {
            count = queries.getOccupationCount(occupationID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count == 0) {
            try {
                queries.addOccupation(occupationID);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                queries.setOccupationCount(occupationID, count + 1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        commit(connection);
    }

    public void incrementSkill(String skillID) 
            throws NonexistentSkillException {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        Integer count = 0;
        
        // Validate skillID
        if (!isValidSkill(skillID)) {
            throw new NonexistentSkillException(skillID);
        }
        
        stopAutoCommit(connection);
        
        try {
            count = queries.getSkillCount(skillID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (count == 0) {
            try {
                queries.addSkill(skillID);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                queries.setSkillCount(skillID, count + 1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        commit(connection);
    }

    public void incrementCourse(String courseCode) 
            throws NonexistentCourseException {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        Integer count = 0;

        // Validate courseCode
        if (!isValidCourse(courseCode)) {
            throw new NonexistentCourseException(courseCode);
        }

        stopAutoCommit(connection);
        
        try {
            count = queries.getCourseCount(courseCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (count == 0) {
            try {
                queries.addCourse(courseCode);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                queries.setCourseCount(courseCode, count + 1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        commit(connection);
    }
    
    public void incrementCertificate(String certificateCode)
            throws NonexistentCertificateException {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        Integer count = 0;
        
        // validate Certificate
        if (!isValidCertificate(certificateCode)) {
            throw new NonexistentCertificateException(certificateCode);
        }
        stopAutoCommit(connection);
        
        try {
            count = queries.getCertificateCount(certificateCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (count == 0) {
            try {
                queries.addCertificate(certificateCode);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                queries.setCertificateCount(certificateCode, count + 1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        commit(connection);
    }

    public List<Occupation> getMostSearchedOccupations(Integer max) {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        
        List<String> occupationIDs = null;
        try {
            occupationIDs = queries.getMostSearchedOccupations(max);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        List<Occupation> list = new ArrayList<Occupation>();
        for (String occupationID : occupationIDs) {
            Occupation occupation = null;
            try {
                occupation = getOccupation(occupationID);
            } catch (NonexistentOccupationException_Exception e) {
                occupation = new Occupation();
                occupation.setOccupationID(occupationID);
                occupation.setTitle("Unknown Occupation id");
            }
            
            if (occupation != null) {
                list.add(occupation);
            }
        }
        return list;
    }

    public List<Skill> getMostDemandedSkills(Integer max) {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        
        List<String> skillIDs = null;
        try {
            skillIDs = queries.getMostDemandedSkills(max);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        List<Skill> list = new ArrayList<Skill>();
        for (String skillID : skillIDs) {
            Skill skill = null;
            try {
                skill = getSkill(skillID);
            } catch (NonexistentSkillException_Exception e) {
                skill = new Skill();
                skill.setSkillID(skillID);
                skill.setName("Unknown skill id");
            }
            if (skill != null) {
                list.add(skill);
            }
        }
        return list;
    }

    public List<Course> getMostSearchedCourses(Integer max) {
        Connection connection = StatisticsDB.dbConnection();
        StatisticsQueries queries = new StatisticsQueries(connection);
        
        List<String> courseCodes = null;
        try {
            courseCodes = queries.getMostSearchedCourses(max);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        List<Course> list = new ArrayList<Course>();
        for (String courseCode : courseCodes) {
            Course course = null;
            try {
                course = getCourse(courseCode);
            } catch (NonexistentCourseException_Exception e) {
                course = new Course();
                course.setCourseCode(courseCode);
                course.setCourseTitle("Unknown course code");
            }
            if (course != null) {
                list.add(course);
            }   
        }
        return list;
    }

    private static Occupation getOccupation(java.lang.String occupationID) throws NonexistentOccupationException_Exception {
        com.statisticsservice.dolservices.DOLService_Service service = new com.statisticsservice.dolservices.DOLService_Service();
        com.statisticsservice.dolservices.DOLService port = service.getDOLServicePort();
        return port.getOccupation(occupationID);
    }

    private static Skill getSkill(java.lang.String skillID) throws NonexistentSkillException_Exception {
        com.statisticsservice.dolservices.DOLService_Service service = new com.statisticsservice.dolservices.DOLService_Service();
        com.statisticsservice.dolservices.DOLService port = service.getDOLServicePort();
        return port.getSkill(skillID);
    }

    private static Course getCourse(java.lang.String courseID) throws NonexistentCourseException_Exception {
        com.statisticsservice.courseservice.CourseService_Service service = new com.statisticsservice.courseservice.CourseService_Service();
        com.statisticsservice.courseservice.CourseService port = service.getCourseServicePort();
        return port.getCourse(courseID);
    }

    private static Certificate getCertificate(java.lang.String certificateCode) throws NonexistentCertificateException_Exception {
        com.statisticsservice.certificateservice.CertificateService_Service service = new com.statisticsservice.certificateservice.CertificateService_Service();
        com.statisticsservice.certificateservice.CertificateService port = service.getCertificateServicePort();
        return port.getCertificate(certificateCode);
    }
    
}
