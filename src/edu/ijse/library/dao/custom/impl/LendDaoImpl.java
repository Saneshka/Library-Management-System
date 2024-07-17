/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.LendDao;
import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.entity.LendEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author hirus
 */
public class LendDaoImpl implements LendDao {

    @Override
    public String LendBook(LendEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO lend (lCode, bookId, memberId, borrowDate, dueDate, fine) VALUES (?,?,?,?,?,?)", entity.getlCode(), entity.getBookId(), entity.getMemberId(), entity.getBorrowDate(), entity.getDueDate(),-1);
        return isSaved ? "Lending Information Added to the System Successfully" : "Failed to add Lending Information";
    }

    @Override
    public ArrayList<LendEntity> getAll() throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM lend");
        ArrayList<LendEntity> entityList = new ArrayList<>();

        while (rest.next()) {
            LendEntity entity = new LendEntity(rest.getInt("lid"), rest.getString("lCode"), rest.getInt("bookId"), rest.getInt("memberId"), rest.getString("borrowDate"), rest.getString("dueDate"), rest.getString("returnDate"), rest.getDouble("fine"));
            entityList.add(entity);
        }
        return entityList;
    }

}
