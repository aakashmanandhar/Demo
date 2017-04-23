/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.demo.Controller;

import com.aakash.demo.DAO.Impl.UserDAOImpl;
import com.aakash.demo.DAO.UserDAO;
import com.aakash.demo.Entity.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakashm
 */
@WebServlet (name = "login", urlPatterns = "/login/*")
public class LoginServlet extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/Views/index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserDAO udao = new UserDAOImpl();
        try {
            User u = udao.login(username, password);
            if (u==null){
                resp.sendRedirect("login?error");
            }else{
                if(!u.isStatus()){
                    resp.sendRedirect("login?error2");
                }else{
                    resp.sendRedirect("home.jsp");
                }
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
