package com.example.social_media.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        StringBuilder body = new StringBuilder();
        String line;
        try (BufferedReader br = req.getReader()) {
            while ((line = br.readLine()) != null) {
                body.append(line);
            }
        }
        String requestBody = body.toString();

        res.setContentType("application/json");
        res.getWriter().write(requestBody);

    }
}