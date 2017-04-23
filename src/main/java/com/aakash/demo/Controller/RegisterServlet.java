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
@WebServlet(name = "register", urlPatterns = {"/register/*"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/Views/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            User u = new User();
            u.setFirstName(req.getParameter("firstname"));
            u.setLastName(req.getParameter("lastname"));
            u.seteMail(req.getParameter("email"));
            u.setUsername(req.getParameter("username"));
            u.setPassword(req.getParameter("password"));
            u.setStatus(false);

            UserDAO udao = new UserDAOImpl();

            if (udao.register(u) > 0) {
                resp.sendRedirect("register?success");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
