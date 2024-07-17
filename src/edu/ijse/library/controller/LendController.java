/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.service.custom.LendService;
import edu.ijse.library.service.ServiceFactory;
import java.util.ArrayList;
/**
 *
 * @author hirus
 */
public class LendController {
    
    private LendService lendService = (LendService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.LEND);
    
    public String save(LendDTO dto) throws Exception{
        return lendService.lendBook(dto);
    }
    public ArrayList<LendDTO> getAll() throws Exception{
        return lendService.getAll();
    }
}
