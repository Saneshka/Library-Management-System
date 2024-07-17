/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author hirus
 */
public class BookDaoImpl implements BookDao{

    @Override
    public String save(BookEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO book VALUES (?,?,?,?,?,?,?,?,?)", 0, entity.getbCode(), entity.getTitle(), entity.getAuthor(), entity.getPublisher(), entity.getPublishDate(), entity.getDescription(), entity.getQty(), entity.getCid());
        return isSaved ? "Successfully Saved" : "Failed to Save";
    }

    @Override
    public String update(BookEntity entity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET title = ?, author = ?, publisher = ?, publishDate = ?, description = ?, qty = ?, cid = ? WHERE bCode = ?", entity.getTitle(), entity.getAuthor(), entity.getPublisher(), entity.getPublishDate(), entity.getDescription(), entity.getQty(), entity.getCid(), entity.getbCode());
        return isUpdated ? "Successfully Updated" : "Failed to Update";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM book WHERE bCode = ?", code);
        return isDeleted ? "Successfully Deleted" : "Failed to Delete";
    }

    @Override
    public BookEntity get(String code) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM book WHERE bCode = ?", code);
        
        if (rest.next()) {
            BookEntity entity = new BookEntity(rest.getInt("bid"), rest.getString("bCode"), rest.getString("title"), rest.getString("author"), rest.getString("publisher"), rest.getString("publishDate"), rest.getString("description"), rest.getInt("qty"), rest.getInt("cid"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM book");
        ArrayList<BookEntity> entities = new ArrayList<>();
        
        while (rest.next()) {            
            BookEntity entity = new BookEntity(rest.getInt("bid"), rest.getString("bCode"), rest.getString("title"), rest.getString("author"), rest.getString("publisher"), rest.getString("publishDate"), rest.getString("description"), rest.getInt("qty"), rest.getInt("cid"));
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public BookEntity getById(int id) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM book WHERE bid = ?", id);
        
        if (rest.next()) {
            BookEntity entity = new BookEntity(rest.getInt("bid"), rest.getString("bCode"), rest.getString("title"), rest.getString("author"), rest.getString("publisher"), rest.getString("publishDate"), rest.getString("description"), rest.getInt("qty"), rest.getInt("cid"));
            return entity;
        }
        return null;
    }
    
}
