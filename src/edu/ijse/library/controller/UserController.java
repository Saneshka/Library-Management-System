/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.UserDTO;
import edu.ijse.library.service.custom.UserService;
import edu.ijse.library.service.ServiceFactory;

/**
 *
 * @author hirus
 */
public class UserController {
    
    private UserService userService = (UserService)ServiceFactory.getInstance().getService(ServiceFactory.serviceType.USER);
    
    public String login(UserDTO dto) throws Exception{
        return userService.login(dto);
    }
}
