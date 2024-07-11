/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.UserDTO;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface UserService extends SuperService{
    String login(UserDTO dto) throws Exception;
    String save(UserDTO dto) throws Exception;
    String update(UserDTO dto) throws Exception;
    String delete(String code) throws Exception;
    UserDTO get(String code) throws Exception;
    ArrayList<UserDTO> getAll() throws Exception;
    
}
