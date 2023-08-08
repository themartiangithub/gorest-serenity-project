package com.gorest.model;

/**
 * Created by Jay
 */
public class UsersPojo {

    private String name;
    private String email;
    private String gender;
    private String status;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static UsersPojo getUsersPojo(String name, String email, String gender, String status) {
        UsersPojo usersPojo = new UsersPojo();
        usersPojo.setName(name);
        usersPojo.setEmail(email);
        usersPojo.setGender(gender);
        usersPojo.setStatus(status);
        return usersPojo;
    }

}
