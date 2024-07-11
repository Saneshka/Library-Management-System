/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.UserEntity;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface UserDao extends SuperDAO{
    
    String login(UserEntity entity)throws Exception;
    String save(UserEntity entity)throws Exception;
    String update(UserEntity entity) throws Exception;
    String delete(String code) throws Exception;
    UserEntity get(String code) throws Exception;
    ArrayList<UserEntity> getAll() throws Exception;
}
