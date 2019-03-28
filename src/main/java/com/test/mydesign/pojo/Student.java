package com.test.mydesign.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String name;

    private Boolean sex;

    private String identity;

    private String phonenumber;

    private String email;

    private Integer educationid;

    private Integer majorid;

    private Integer grade;

    private String nationality;

    private String graduationshcoolid;

    private String resume;

    private String account;

    private String password;

    private String estimation3;

    private String estimation4;

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
        this.name = name == null ? null : name.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getGraduationshcoolid() {
        return graduationshcoolid;
    }

    public void setGraduationshcoolid(String graduationshcoolid) {
        this.graduationshcoolid = graduationshcoolid == null ? null : graduationshcoolid.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEstimation3() {
        return estimation3;
    }

    public void setEstimation3(String estimation3) {
        this.estimation3 = estimation3 == null ? null : estimation3.trim();
    }

    public String getEstimation4() {
        return estimation4;
    }

    public void setEstimation4(String estimation4) {
        this.estimation4 = estimation4 == null ? null : estimation4.trim();
    }
}