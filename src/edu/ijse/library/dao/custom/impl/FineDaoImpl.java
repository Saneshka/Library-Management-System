/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.FineDao;
import edu.ijse.library.entity.FineEntity;

/**
 *
 * @author hirus
 */
public class FineDaoImpl implements FineDao{

    @Override
    public String save(FineEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO fine VALUES (?,?,?,?)", 0, entity.getLendId(), entity.getAmount(), entity.getIsPaid());
        return  isSaved ? "Success" : "Failed";
    }
    
}
