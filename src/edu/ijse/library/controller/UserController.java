/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.UserDTO;
import edu.ijse.library.service.custom.UserService;
import edu.ijse.library.service.ServiceFactory;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class UserController {
    
    private UserService userService = (UserService)ServiceFactory.getInstance().getService(ServiceFactory.serviceType.USER);
    
    public String login(UserDTO dto) throws Exception{
        return userService.login(dto);
    }
    public String save(UserDTO dto) throws Exception{
        return userService.save(dto);
    }
    public String update(UserDTO dto) throws Exception{
        return userService.update(dto);
    }
    public String Delete(String code) throws Exception{
        return userService.delete(code);
    }
    public UserDTO get(String code) throws Exception{
        return userService.get(code);
    }
    public ArrayList<UserDTO> getAll() throws Exception{
        return userService.getAll();
    }
}
