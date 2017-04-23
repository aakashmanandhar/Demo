/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.demo.DAO.Impl;

import com.aakash.demo.DAO.UserDAO;
import com.aakash.demo.DBConnector.DBConnection;
import com.aakash.demo.Entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public class UserDAOImpl implements UserDAO {

    private DBConnection db = new DBConnection();

    @Override
    public int register(User u) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO user (firstName, lastName, eMail, username, password, status) VALUES (?,?,?,?,?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, u.getFirstName());
        stmt.setString(2, u.getLastName());
        stmt.setString(3, u.geteMail());
        stmt.setString(4, u.getUsername());
        stmt.setString(5, u.getPassword());
        stmt.setBoolean(6, u.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public User login(String username, String password) throws SQLException, ClassNotFoundException {
        User u = null;
        String sql = "SELECT * FROM user WHERE username=? AND password=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = db.executeQuery();
        if (rs.next()) {
            u = new User();
            u.setUserId(rs.getInt("userId"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return u;
    }

}
