package com.example.java_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Zsw
 * @create 2023-03-28 11:27
 */
@Entity
public class test_data {
    @Id
    private int id;
    private String name;

    public test_data(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public test_data() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
