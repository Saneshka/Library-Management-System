/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.MemberDTO;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class MemberController {
    
    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.MEMBER);
    
    public String save(MemberDTO dto) throws Exception{
        return memberService.save(dto);
    }
    public String update(MemberDTO dto) throws Exception{
        return memberService.update(dto);
    }
    public String delete(String code) throws Exception{
        return memberService.delete(code);
    }
    public MemberDTO get(String code) throws Exception{
        return memberService.get(code);
    }
    public ArrayList<MemberDTO> getAll() throws Exception{
        return memberService.getAll();
    }
}
