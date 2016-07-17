// default package
package com.xtkj.wowplay.dto;

import com.xtkj.wowplay.entity.Tag;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class SortDTO{
     private int id;
     private String name;
     private int pid;
     private String stringTags ;
     private Set<Tag> tags ;


    public SortDTO() {
    }

    public SortDTO(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;

    }

    public SortDTO(int id, String name, int pid,Set<Tag> tags) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.tags=tags;
    }


    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getStringTags() {
        return stringTags;
    }

    public void setStringTags(String stringTags) {
        this.stringTags = stringTags;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}