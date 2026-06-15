package com.example.personapi.model;

import java.util.Date;

public class Person {

    private Long id;
    private String name;
    private String email;
    private int age;
    private double money;
    private String city;
    private String profession;
    private boolean active;
    private String gender;
    private Date cr_dt;

    public Person() {
    }

    public Person(Long id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // City
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    // Profession
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    // Active
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    // Gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Cr_dt
    public Date getCr_dt() {
        return cr_dt;
    }
    public void setCr_dt(Date cr_dt) {
        this.cr_dt = cr_dt;
    }

    public Double getMoney()
    {
        return money;
    }

    public void setMoney(double m)
    {
        this.money = m;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
