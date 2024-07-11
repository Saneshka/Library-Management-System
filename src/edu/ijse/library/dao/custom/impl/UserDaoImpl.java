/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.UserDao;
import edu.ijse.library.entity.UserEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String login(UserEntity entity) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT password FROM user WHERE username = ?", entity.getUsername());
        String result = "Incorrect Username or Password. Try Again!";
        if (rest.next()) {
            if (rest.getString("password").equals(entity.getPassword())) {
                result = "Success";
            }
        }

        return result;
    }

    @Override
    public String save(UserEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO user VALUES (?,?,?,?,?,?)",0, entity.getuCode(), entity.getFirstName(), entity.getLastName(), entity.getUsername(), entity.getPassword());
        return isSaved ? "Successfully Saved" : "Failed to Save";
    }

    @Override
    public String update(UserEntity entity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE user SET firstName = ? , lastName = ?, username = ?, password = ? WHERE uCode = ?", entity.getFirstName(), entity.getLastName(), entity.getUsername(), entity.getPassword(), entity.getuCode());
        return  isUpdated ? "Successfully Updated" : "Failed to Update";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM user WHERE uCode = ?", code);
        return isDeleted ? "Successfully Deleted" : "Failed to Delete";
    }

    @Override
    public UserEntity get(String code) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM user WHERE uCode = ?", code);
        if (rest.next()) {
            UserEntity entity = new UserEntity(rest.getString("uCode"), rest.getString("firstName"), rest.getString("lastName"), rest.getString("username"), rest.getString("password"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM user");
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        
        while (rest.next()) {            
            UserEntity entity = new UserEntity(rest.getString("uCode"), rest.getString("firstName"), rest.getString("lastName"), rest.getString("username"), rest.getString("password"));
            userEntities.add(entity);
        }
        return userEntities;
        
    }

}
