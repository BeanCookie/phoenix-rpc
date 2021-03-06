package com.lzzz.phoenix.rpc.example.model;

import java.io.Serializable;

public class HelloDTO implements Serializable {
    private Integer id;
    private String name;

    public HelloDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
