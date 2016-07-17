// default package
package com.xtkj.wowplay.dto;


import java.util.HashSet;
import java.util.Set;


/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class CourseDTO  {


     private int id;
     private SortDTO sort;
     private String coursename;
     private String picpath;
     private String author;
     private String CDesc;
     private Set courseTags = new HashSet(0);


    public CourseDTO() {
    }


    public CourseDTO(int id, SortDTO sort, String coursename, String picpath, String author, String CDesc) {
        this.id = id;
        this.sort = sort;
        this.coursename = coursename;
        this.picpath = picpath;
        this.author = author;
        this.CDesc = CDesc;
    }
    

    public CourseDTO(int id, SortDTO sort, String coursename, String picpath, String author, String CDesc, Set courseTags) {
        this.id = id;
        this.sort = sort;
        this.coursename = coursename;
        this.picpath = picpath;
        this.author = author;
        this.CDesc = CDesc;
        this.courseTags = courseTags;
    }


    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public SortDTO getSort() {
        return this.sort;
    }
    
    public void setSort(SortDTO sort) {
        this.sort = sort;
    }

    public String getCoursename() {
        return this.coursename;
    }
    
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getPicpath() {
        return this.picpath;
    }
    
    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCDesc() {
        return this.CDesc;
    }
    
    public void setCDesc(String CDesc) {
        this.CDesc = CDesc;
    }

    public Set getCourseTags() {
        return this.courseTags;
    }
    
    public void setCourseTags(Set courseTags) {
        this.courseTags = courseTags;
    }
   



}