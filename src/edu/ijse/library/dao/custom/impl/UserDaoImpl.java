/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.UserDao;
import edu.ijse.library.entity.UserEntity;
import java.sql.ResultSet;

/**
 *
 * @author hirus
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String login(UserEntity entity) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT password FROM user WHERE username = ?", entity.getUsername());
        String result = "fail";
        if (rest.next()) {
            if (rest.getString("password").equals(entity.getPassword())) {
                System.out.println("working");
                result = "Success";
            }
        }

        return result;
    }

}
