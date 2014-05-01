/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.statisticsservice.queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class StatisticsQueries {
    private Connection connection;
    
    public StatisticsQueries(Connection connection) {
        this.connection = connection;
    }
    
    public Integer getOccupationCount(String occupationID) 
            throws SQLException {
        String countQuery = "SELECT count FROM stats_occupation_searches WHERE occupation_id = ?";
        Integer count = 0;
        PreparedStatement stmt = connection.prepareStatement(countQuery);
        stmt.setString(1, occupationID);
        ResultSet results = stmt.executeQuery();
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public Integer getSkillCount(String skillID)
            throws SQLException {
        String countQuery = "SELECT count FROM stats_skill_demands WHERE skill_id = ?";
        Integer count = 0;
        PreparedStatement stmt = connection.prepareStatement(countQuery);
        stmt.setString(1, skillID);
        ResultSet results = stmt.executeQuery();
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;    
    }
    
    public Integer getCourseCount(String courseCode)
            throws SQLException {
        String countQuery = "SELECT count FROM stats_course_searches WHERE course_code = ?";
        Integer count = 0;
        PreparedStatement stmt = connection.prepareStatement(countQuery);
        stmt.setString(1, courseCode);
        ResultSet results = stmt.executeQuery();
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;    
    }
    
    public Integer getCertificateCount(String certificateCode) 
            throws SQLException {
        String countQuery = "SELECT count FROM stats_certificate_searches WHERE certificate_code = ?";
        Integer count = 0;
        PreparedStatement stmt = connection.prepareStatement(certificateCode);
        stmt.setString(1, certificateCode);
        ResultSet results = stmt.executeQuery();
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public Integer setOccupationCount(String occupationID, Integer count) 
            throws SQLException {
        String setQuery =   " UPDATE stats_occupation_searches " +
                            " SET count = ? " +
                            " WHERE occupation_id = ? ";
        PreparedStatement stmt = connection.prepareStatement(setQuery);
        stmt.setInt(1, count);
        stmt.setString(2, occupationID);
        return stmt.executeUpdate();
    }
    
    public Integer setSkillCount(String skillID, Integer count) 
            throws SQLException {
        String setQuery =   " UPDATE stats_skill_demands " +
                            " SET count = ? " +
                            " WHERE skill_id = ? ";
        PreparedStatement stmt = connection.prepareStatement(setQuery);
        stmt.setInt(1, count);
        stmt.setString(2, skillID);
        return stmt.executeUpdate();
    }
    
    public Integer setCourseCount(String courseCode, Integer count) 
            throws SQLException {
        String setQuery =   " UPDATE stats_course_searches " +
                            " SET count = ? " +
                            " WHERE course_code = ? ";
        PreparedStatement stmt = connection.prepareStatement(setQuery);
        stmt.setInt(1, count);
        stmt.setString(2, courseCode);
        return stmt.executeUpdate();
    }
    
    public Integer setCertificateCount(String certificateCode, Integer count)
            throws SQLException {
        String setQuery = " UPDATE stats_certificate_searches " +
                          " SET count = ? " +
                          " WHERE certificate_code = ? ";
        PreparedStatement stmt = connection.prepareStatement(setQuery);
        stmt.setInt(1, count);
        stmt.setString(2, certificateCode);
        return stmt.executeUpdate();
    }
    
    public Integer addOccupation(String occupationID) 
            throws SQLException {
        String insert = " INSERT INTO stats_occupation_searches(occupation_id, count) " +
                        " VALUES (?, 1) ";
        PreparedStatement stmt = connection.prepareStatement(insert);
        stmt.setString(1, occupationID);
        return stmt.executeUpdate();
    }
    
    public Integer addSkill(String skillID) 
            throws SQLException {
        String insert = " INSERT INTO stats_skill_demands(skill_id, count) " +
                        " VALUES (?, 1) ";
        PreparedStatement stmt = connection.prepareStatement(insert);
        stmt.setString(1, skillID);
        return stmt.executeUpdate();
    }
    
    public Integer addCourse(String courseCode) 
            throws SQLException {
        String insert = " INSERT INTO stats_course_searches(course_code, count) " +
                        " VALUES (?, 1) ";
        PreparedStatement stmt = connection.prepareStatement(insert);
        stmt.setString(1, courseCode);
        return stmt.executeUpdate();
    }
    
    public Integer addCertificate(String certificateCode)
            throws SQLException {
        String insert = " INSERT INTO stats_certificate_searches(certificate_code, count) " +
                        " VALUES (?, 1) ";
        PreparedStatement stmt = connection.prepareStatement(insert);
        stmt.setString(1, certificateCode);
        return stmt.executeUpdate();
    }
    
    public Integer getTotalCourseCount() 
            throws SQLException {
        String query = " SELECT sum(count) as total FROM stats_course_searches ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        Integer count = 0;
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public Integer getTotalSkillCount()
            throws SQLException {
        String query = " SELECT sum(count) as total FROM stats_skill_demands ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        Integer count = 0;
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public Integer getTotalOccupation() 
            throws SQLException {
        String query = " SELECT sum(count) as total FROM stats_occupation_searches ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        Integer count = 0;
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public Integer getTotalCertificateCount()
            throws SQLException {
        String query = " SELECT sum(count) as total FROM stats_certificate_searches ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        Integer count = 0;
        if (results.isBeforeFirst()) {
            results.next();
            count = results.getInt("count");
        }
        return count;
    }
    
    public List<String> getMostSearchedCourses(Integer max) 
            throws SQLException {
        String query = " SELECT * FROM stats_course_searches "
                + " ORDER BY count DESC ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        
        List<String> list = new ArrayList<String>();
        int count = 0;
        while (results.next() && 
               count < max) {
            list.add(results.getString("course_code"));
            count++;
        }
        return list;
    }
    
    public List<String> getMostDemandedSkills(Integer max)
            throws SQLException {
        String query = " SELECT * FROM stats_skill_demands "
                + " ORDER BY count DESC ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        
        List<String> list = new ArrayList<String>();
        int count = 0;
        while (results.next() && 
               count < max) {
            list.add(results.getString("skill_id"));
            count++;
        }
        return list;
    }
    
    public List<String> getMostSearchedOccupations(Integer max) 
            throws SQLException {
        String query = " SELECT * FROM stats_occupation_searches "
                + " ORDER BY count DESC ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        
        List<String> list = new ArrayList<String>();
        int count = 0;
        while (results.next() && 
               count < max) {
            list.add(results.getString("occupation_id"));
            count++;
        }
        return list;
    }
    
    public List<String> getMostSearchedCertificates(Integer max) 
            throws SQLException {
        String query = " SELECT * FROM stats_certificates_searches "
                + " ORDER BY count DESC ";
        Statement stmt = connection.createStatement();
        ResultSet results = stmt.executeQuery(query);
        
        List<String> list = new ArrayList<String>();
        int count = 0;
        while (results.next() && 
               count < max) {
            list.add(results.getString("certificate_code"));
            count++;
        }
        return list;
    }
}
