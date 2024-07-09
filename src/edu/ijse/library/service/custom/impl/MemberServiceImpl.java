/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dto.MemberDTO;
import edu.ijse.library.entity.MemberEntity;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class MemberServiceImpl implements MemberService{
    
    private MemberDao dao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.MEMBER);

    @Override
    public String save(MemberDTO dto) throws Exception {
        MemberEntity entity = new MemberEntity(dto.getmCode(), dto.getFirstName(), dto.getLastName(), dto.getPhoneNo(), dto.getAddress());
        return dao.save(entity);
    }

    @Override
    public String update(MemberDTO dto) throws Exception {
        MemberEntity entity = new MemberEntity(dto.getmCode(), dto.getFirstName(), dto.getLastName(), dto.getPhoneNo(), dto.getAddress());
        return dao.update(entity);
    }

    @Override
    public String delete(String code) throws Exception {
       return dao.delete(code);
    }

    @Override
    public MemberDTO get(String code) throws Exception {
        MemberEntity entity = dao.get(code);
        MemberDTO dto = new MemberDTO(entity.getmCode(), entity.getFirstName(), entity.getLastName(), entity.getPhoneNo(), entity.getAddress());
        return dto;
    }

    @Override
    public ArrayList<MemberDTO> getAll() throws Exception {
        ArrayList<MemberEntity> entityList = dao.getAll();
        ArrayList<MemberDTO> dtoList = new  ArrayList<>();
        
        for(MemberEntity entity : entityList){
            MemberDTO dto = new MemberDTO(entity.getmCode(), entity.getFirstName(), entity.getLastName(), entity.getPhoneNo(), entity.getAddress());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
