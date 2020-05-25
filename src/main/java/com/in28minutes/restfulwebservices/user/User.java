package com.in28minutes.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description = "All details about the user.")
public class User {
    private Integer id;

    @Size(min=2, message = "Name should have atleast 2 characters")
    @ApiModelProperty(notes = "Name should have atleast 2 characters")
    private String name;
    @Past
    @ApiModelProperty(notes = "Bitrh date should be in the past")
    private Date birthDate;

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
        return birthDate;
    }

    public void setVirthDate(Date virthDate) {
        this.birthDate = virthDate;
    }

    public User(Integer id, String name, Date virthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = virthDate;
    }


}
