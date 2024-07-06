/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.custom.UserDao;
import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dto.UserDTO;
import edu.ijse.library.entity.UserEntity;
import edu.ijse.library.service.custom.UserService;

/**
 *
 * @author hirus
 */
public class UserServiceImpl implements UserService{
    
    private UserDao dao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.USER);

    @Override
    public String login(UserDTO dto) throws Exception {
        UserEntity entity = new UserEntity(dto.getUsername(),dto.getPassword());
        return dao.login(entity);
    }
    
}
