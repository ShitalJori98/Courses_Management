package com.rest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Course(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }
}
