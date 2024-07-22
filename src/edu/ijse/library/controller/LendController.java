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
    
    public String lendBook(LendDTO dto) throws Exception{
        return lendService.lendBook(dto);
    }
    public ArrayList<LendDTO> getAll() throws Exception{
        return lendService.getAll();
    }
    public LendDTO get(String code) throws Exception{
        return lendService.get(code);
    }
    public String update(LendDTO dto)throws Exception{
        return lendService.update(dto);
    }
    public  String lateReturnBook(LendDTO dto)throws Exception{
        return lendService.lateReturnBook(dto);
    }
    public String payFine(int lid) throws Exception{
        System.out.println("Controller Lid : " + lid);
        return lendService.payFine(lid);
    }
}
