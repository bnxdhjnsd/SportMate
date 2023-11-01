package com.example.demo;

public class Member {
    private String name;
    private String age;
    private String gender;
    private String email;
    private String phone;
    private String team;
    public Member(){

    }
    public Member(String name, String age, String gender, String email, String phone, String team) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.team = team;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + gender + "," + email + "," + phone + "," + team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
