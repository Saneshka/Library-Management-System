/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface LendService extends SuperService{
    String lendBook(LendDTO dto) throws Exception;
    ArrayList<LendDTO> getAll() throws Exception;
    LendDTO get(String code) throws Exception;
    String update(LendDTO dto) throws Exception;
    String lateReturnBook(LendDTO dto) throws Exception;
}
