package com.cpm.controller;

import java.io.IOException;

/**
 * Created by JAMES on 2017/5/13.
 */
public class MavenServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        request.setAttribute("tip", name + " is coming...");//把提示信息存入request域中！！(这是test分支下的注释信息)000000
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
