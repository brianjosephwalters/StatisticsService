/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.statisticsservice;

import com.statisticsservice.business.StatisticsServiceImpl;
import com.statisticsservice.certificateservice.Certificate;
import com.statisticsservice.courseservice.Course;
import com.statisticsservice.dolservices.Occupation;
import com.statisticsservice.dolservices.Skill;
import com.statisticsservice.exceptions.NonexistentCertificateException;
import com.statisticsservice.exceptions.NonexistentCourseException;
import com.statisticsservice.exceptions.NonexistentOccupationException;
import com.statisticsservice.exceptions.NonexistentSkillException;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author bjw
 */
@WebService(serviceName = "StatisticsService")
public class StatisticsService {
    
    StatisticsServiceImpl impl;
    
    public StatisticsService() {
        this.impl = new StatisticsServiceImpl();
    }
    
    @WebMethod(operationName = "incrementOccupation")
    public void incrementOccupation(
            @WebParam(name = "occupationID") String occupationID)
            throws NonexistentOccupationException {
        impl.incrementOccupation(occupationID);
    }
    
    @WebMethod(operationName = "incrementSkill")
    public void incrementSkill(
            @WebParam(name = "skillID") String skillID) 
            throws NonexistentSkillException {
        impl.incrementSkill(skillID);
    }
    
    @WebMethod(operationName = "incrementCourse")
    public void incrementCourse(
            @WebParam(name = "courseCode") String courseCode)
            throws NonexistentCourseException {
        impl.incrementCourse(courseCode);
    }
    
    @WebMethod(operationName = "incrementCertificate")
    public void incrementCertificate(
            @WebParam(name = "certificateCode") String certificateCode)
            throws NonexistentCertificateException {
        impl.incrementCertificate(certificateCode);
    }
    
    @WebMethod(operationName = "getMostSearchOccupations")
    public List<Occupation> getMostSearchedOccupations(
            @WebParam(name = "max") Integer max) {
        return impl.getMostSearchedOccupations(max);
    }
    
    @WebMethod(operationName = "getMostDemandedSkills")
    public List<Skill> getMostDemandedSkills (
            @WebParam(name = "max") Integer max) {
        return impl.getMostDemandedSkills(max);
    }
    
    @WebMethod(operationName = "getMostSearchedCourses")
    public List<Course> getMostSearchedCourses(
            @WebParam(name = "max") Integer max) {
        return impl.getMostSearchedCourses(max);
    }
    
    @WebMethod(operationName = "getMostSearchedCertificates")
    public List<Certificate> getMostSearchedCertificates(
            @WebParam(name = "max") Integer max) {
        return impl.getMostSearchedForCertificate(max);
    }
    
}
