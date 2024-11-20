package org.example.labs7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ComplexCalculatorServlet")
public class ComplexCalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        double realPart = Double.parseDouble(request.getParameter("realPart"));
        double imaginaryPart = Double.parseDouble(request.getParameter("imaginaryPart"));

        // Calculate complex number properties
        double absoluteValue = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double argument = Math.atan2(imaginaryPart, realPart);
        double conjugateImaginary = -imaginaryPart;

        // Set response content type
        response.setContentType("text/html");

        // Generate response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Complex Number Results</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Property</th><th>Value</th></tr>");
        out.println("<tr><td>Absolute Value</td><td>" + absoluteValue + "</td></tr>");
        out.println("<tr><td>Argument</td><td>" + argument + " radians</td></tr>");
        out.println("<tr><td>Complex Conjugate</td><td>" + realPart + " + " + conjugateImaginary + "i</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}

