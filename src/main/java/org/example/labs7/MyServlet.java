package org.example.labs7;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String gender = request.getParameter("gender");
        String terms = request.getParameter("terms");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Result:</h1>");
        out.println("<p>User: " + username + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Agree to the terms and conditions: " + (terms != null ? "Yes" : "No") + "</p>");
        out.println("</body></html>");
    }
}
