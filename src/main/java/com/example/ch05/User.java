package com.example.ch05;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String dob;             // ngày sinh
    private String source;          // nguồn biết đến
    private boolean announcements;  // có muốn nhận thông báo?
    private boolean emailOK;        // có đồng ý nhận email?
    private String contactMethod;   // phương thức liên hệ

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        source = "";
        announcements = false;
        emailOK = false;
        contactMethod = "";
    }

    public User(String firstName, String lastName, String email,
                String dob, String source, boolean announcements,
                boolean emailOK, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.source = source;
        this.announcements = announcements;
        this.emailOK = emailOK;
        this.contactMethod = contactMethod;
    }

    // Getters và Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(boolean announcements) {
        this.announcements = announcements;
    }

    public boolean isEmailOK() {
        return emailOK;
    }

    public void setEmailOK(boolean emailOK) {
        this.emailOK = emailOK;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
