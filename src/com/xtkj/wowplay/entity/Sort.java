// default package
package com.xtkj.wowplay.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name="tb_sort")
public class Sort implements Serializable {

     private int id;
     private String name;
     private int pid;
     private Set tags = new HashSet(0);

    public Sort() {
    }

    public Sort(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public Sort(int id, String name, int pid, Set tags) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.tags = tags;
    }

    @Id
    @GeneratedValue
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
    @OneToMany(mappedBy = "sort",targetEntity = Tag.class,cascade = CascadeType.ALL)
    public Set getTags() {
        return tags;
    }

    public void setTags(Set tags) {
        this.tags = tags;
    }
}