/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.custom.LendDao;
import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.entity.LendEntity;
import edu.ijse.library.service.custom.LendService;
import edu.ijse.library.dao.DaoFactory;
import java.util.ArrayList;
/**
 *
 * @author hirus
 */
public class LendServiceImpl implements LendService{
    
    private LendDao dao = (LendDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.LEND);

    @Override
    public String lendBook(LendDTO dto) throws Exception {
        LendEntity entity = new LendEntity(dto.getlCode(), dto.getBookId(), dto.getMemberId(), dto.getBorrowDate(), dto.getDueDate());
        return dao.LendBook(entity);
    }

    @Override
    public ArrayList<LendDTO> getAll() throws Exception {
        ArrayList<LendEntity> entityList = dao.getAll();
        ArrayList<LendDTO> dtoList = new ArrayList<>();
        
        for(LendEntity entity: entityList){
            LendDTO dto = new LendDTO(entity.getLid(), entity.getlCode(), entity.getBookId(), entity.getMemberId(), entity.getBorrowDate(), entity.getDueDate(), entity.getReturnDate(), entity.getFine());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
    
}
