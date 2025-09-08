package com.example.ch05;

public class UserDB {

    public static long insert(User user) {
        // TODO: Add JDBC code để lưu user vào database
        // Hiện tại chỉ giả lập việc insert
        System.out.println("User inserted: " + user.getFirstName() + " " + user.getLastName()
                + ", email: " + user.getEmail()
                + ", dob: " + user.getDob()
                + ", source: " + user.getSource()
                + ", announcements: " + user.isAnnouncements()
                + ", emailOK: " + user.isEmailOK()
                + ", contactMethod: " + user.getContactMethod());
        return 1; // giả sử luôn thành công
    }
}
