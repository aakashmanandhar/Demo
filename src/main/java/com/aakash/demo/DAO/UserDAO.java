/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.demo.DAO;

import com.aakash.demo.Entity.User;
import java.sql.SQLException;

/**
 *
 * @author aakashm
 */
public interface UserDAO {
    
    int register(User u) throws SQLException, ClassNotFoundException;
    User login(String username, String password)throws SQLException, ClassNotFoundException;
    
}
