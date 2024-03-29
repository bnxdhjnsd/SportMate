package com.example.demo;
/**
 * The 'Member' class represents a member in the application, has attributes such as name, age, gender, email, phone, and team.
 */
public class Member {
    private String name;
    private String age;
    private String gender;
    private String email;
    private String phone;
    private String team;
    /**
     * non-para constructor for the Member class.
     */
    public Member(){

    }
    /**
     * Parameterized constructor for creating a Member with specified details.
     *
     * @param name   The name of the member.
     * @param age    The age of the member.
     * @param gender The gender of the member.
     * @param email  The email address of the member.
     * @param phone  The phone number of the member.
     * @param team   The team to which the member belongs.
     */
    public Member(String name, String age, String gender, String email, String phone, String team) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.team = team;
    }
    /**
     * Returns a string representation of the member in the format: "name, age, gender, email, phone, team".
     */
    @Override
    public String toString() {
        return name + "," + age + "," + gender + "," + email + "," + phone + "," + team;
    }
    /**
     * Gets the name of the member.
     *
     * @return The name of the member.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the member.
     *
     * @param name The name to set for the member.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the age of the member.
     *
     * @return The age of the member.
     */
    public String getAge() {
        return age;
    }
    /**
     * Sets the age of the member.
     *
     * @param age The age to set for the member.
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * Gets the gender of the member.
     *
     * @return The gender of the member.
     */
    public String getGender() {
        return gender;
    }
    /**
     * Sets the gender of the member.
     *
     * @param gender The gender to set for the member.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Gets the email address of the member.
     *
     * @return The email address of the member.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets the email address of the member.
     *
     * @param email The email address to set for the member.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Gets the phone number of the member.
     *
     * @return The phone number of the member.
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Sets the phone number of the member.
     *
     * @param phone The phone number to set for the member.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Gets the team to which the member belongs.
     *
     * @return The team of the member.
     */
    public String getTeam() {
        return team;
    }
    /**
     * Sets the team to which the member belongs.
     *
     * @param team The team to set for the member.
     */
    public void setTeam(String team) {
        this.team = team;
    }
}
