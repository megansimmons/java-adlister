package com.codeup.adlister.controllers;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: show the registration form


        request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(new Config());

        Statement statement = connection.createStatement();



        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
    }
}
