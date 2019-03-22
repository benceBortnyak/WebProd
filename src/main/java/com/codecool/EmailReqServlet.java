package com.codecool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailReqServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usrEmail = request.getParameter("email");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<B>Thanks for giving your email address we will bombard you with our promotions (: <br> ");
        printWriter.println(usrEmail);
        printWriter.println("<br>"+ "<h1>Thanks!</h1>");
        printWriter.close();
    }
}
