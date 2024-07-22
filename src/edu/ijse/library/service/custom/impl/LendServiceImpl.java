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
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.dao.custom.FineDao;
import edu.ijse.library.db.DBConnection;
import edu.ijse.library.entity.FineEntity;
import java.util.ArrayList;
import java.sql.Connection;
/**
 *
 * @author hirus
 */
public class LendServiceImpl implements LendService{
    
    private LendDao dao = (LendDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.LEND);
    private FineDao fineDao = (FineDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.FINE);
    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.BOOK);

    @Override
    public String lendBook(LendDTO dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            LendEntity entity = new LendEntity(dto.getlCode(), dto.getBookId(), dto.getMemberId(), dto.getBorrowDate(), dto.getDueDate());
            String LendResp = dao.LendBook(entity);
            
            if (LendResp.equals("Success")) {
                String bookResp = bookDao.lendBook(dto.getBookId());
                
                if (bookResp.equals("Success")) {
                    connection.commit();
                    return "Book Lend Successful";
                }else{
                    connection.rollback();
                    return "Book table Update error";
                }
            }else{
                connection.rollback();
                return "Lend table Update error";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return "Server Error";
        }finally{
            connection.setAutoCommit(true);
        }
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

    @Override
    public LendDTO get(String code) throws Exception {
        LendEntity entity = dao.get(code);
        LendDTO dto = new LendDTO(entity.getLid(), entity.getlCode(), entity.getBookId(), entity.getMemberId(), entity.getBorrowDate(), entity.getDueDate(), entity.getReturnDate(), entity.getFine());
        return dto;
    }

    @Override
    public String update(LendDTO dto) throws Exception {
        LendEntity entity = new LendEntity(dto.getlCode(), dto.getReturnDate(), dto.getFine());
        return dao.update(entity);
    }

    @Override
    public String lateReturnBook(LendDTO dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            
            LendEntity lendEntity = new LendEntity(dto.getlCode(), dto.getReturnDate(), dto.getFine());
            String resp = dao.update(lendEntity);
            
            if (resp.equals("Success")) {
                FineEntity fineEntity = new  FineEntity(dto.getLid(), dto.getFine(), false);
                String respFromFine = fineDao.save(fineEntity);
                
                if (respFromFine.equals("Success")) {
                    connection.commit();
                    return "Book Returned Successfully";
                }else{
                    connection.rollback();
                    return "Failed to add Fine";
                }
                
            }else{
                connection.rollback();
                return "Failed to Update Lend Details";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return "Server Error";
        }finally{
            connection.setAutoCommit(true);
        }
    }

    @Override
    public String payFine(int lid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            
            String fineResp = fineDao.payFine(lid);
            
            if (fineResp.equals("Success")) {
                String lendResp = dao.payFine(lid);
                
                if (lendResp.equals("Success")) {
                    connection.commit();
                    return "Fine Paid";
                }else{
                    connection.rollback();
                    return "Failed to update lend Table";
                }
            }else{
                connection.rollback();
                return "Failed to update Fine table";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return "Server Error";
        }
        finally{
            connection.setAutoCommit(true);
        }
    }
    
    
}
