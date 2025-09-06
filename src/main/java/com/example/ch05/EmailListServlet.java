package com.example.ch05;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.example.ch05.User;
import com.example.ch05.UserDB;

import java.io.IOException;


@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.jsp";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        if (action.equals("join")) {
            url = "/index.jsp";
        }
        else if (action.equals("add")) {
            // lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String source = request.getParameter("source");
            String announcements = request.getParameter("announcements");
            String emailOK = request.getParameter("emailOK");
            String contactMethod = request.getParameter("contactMethod");

            // tạo đối tượng User (sau khi bạn bổ sung constructor và fields trong User.java)
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setDob(dob);
            user.setSource(source);
            user.setAnnouncements(announcements != null);
            user.setEmailOK(emailOK != null);
            user.setContactMethod(contactMethod);

            // validate 3 trường chính
            String message;
            if (firstName == null || lastName == null || email == null ||
                    firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "Please fill out all required fields.";
                url = "/index.jsp";
            } else {
                message = "";
                url = "/thanks.jsp";
                UserDB.insert(user); // nếu bạn muốn lưu DB
            }

            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}
