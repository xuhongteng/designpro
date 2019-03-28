package com.test.mydesign.pojo;

import java.io.Serializable;

public class University implements Serializable {
    private String id;

    private String idcode;

    private String name;

    private String administration;

    private String location;

    private String levertype;

    private String remorks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode == null ? null : idcode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration == null ? null : administration.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLevertype() {
        return levertype;
    }

    public void setLevertype(String levertype) {
        this.levertype = levertype == null ? null : levertype.trim();
    }

    public String getRemorks() {
        return remorks;
    }

    public void setRemorks(String remorks) {
        this.remorks = remorks == null ? null : remorks.trim();
    }
}