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
import java.util.ArrayList;

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

    @Override
    public String save(UserDTO dto) throws Exception {
        UserEntity entity = new UserEntity(dto.getuCode(), dto.getFirstName(), dto.getLastName(), dto.getUsername(), dto.getPassword());
        return dao.save(entity);
    }

    @Override
    public String update(UserDTO dto) throws Exception {
        UserEntity entity = new UserEntity(dto.getuCode(), dto.getFirstName(), dto.getLastName(), dto.getUsername(), dto.getPassword());
        return dao.update(entity);
    }

    @Override
    public String delete(String code) throws Exception {
        return dao.delete(code);
    }

    @Override
    public UserDTO get(String code) throws Exception {
        UserEntity entity = dao.get(code);
        UserDTO dto = new UserDTO(entity.getuCode(), entity.getFirstName(), entity.getLastName(), entity.getUsername(), entity.getPassword());
        return dto;
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        ArrayList<UserEntity> entityList = dao.getAll();
        ArrayList<UserDTO> dtoList = new ArrayList<>();
        
        for(UserEntity entity: entityList){
            UserDTO dto = new UserDTO(entity.getuCode(), entity.getFirstName(), entity.getLastName(), entity.getUsername(), entity.getPassword());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
