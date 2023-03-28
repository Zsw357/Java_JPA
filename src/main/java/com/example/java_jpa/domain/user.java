package com.example.java_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Zsw
 * @create 2023-03-28 10:52
 */
@Entity
public class user {
    @Id
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user() {

    }

    public user(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
