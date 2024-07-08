/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.MemberDTO;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface MemberService extends SuperService{
    String save(MemberDTO dto) throws Exception;
    String update(MemberDTO dto) throws Exception;
    String delete(String code) throws Exception;
    MemberDTO get(String code) throws Exception;
    ArrayList<MemberDTO> getAll() throws Exception;
}
