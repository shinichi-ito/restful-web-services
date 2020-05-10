package com.in28minutes.restfulwebservices.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date virthDate;

    public Integer getId() {
        return id;
    }

    public User() {
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

    public Date getVirthDate() {
        return virthDate;
    }

    public void setVirthDate(Date virthDate) {
        this.virthDate = virthDate;
    }

    public User(Integer id, String name, Date virthDate) {
        this.id = id;
        this.name = name;
        this.virthDate = virthDate;
    }


}
