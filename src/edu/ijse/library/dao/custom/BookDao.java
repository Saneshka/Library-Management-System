/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.BookEntity;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface BookDao extends SuperDAO{
    String save(BookEntity entity) throws Exception;
    String update(BookEntity entity) throws Exception;
    String delete(String code) throws Exception;
    BookEntity get(String code) throws Exception;
    BookEntity getById(int id) throws Exception;
    ArrayList<BookEntity> getAll() throws Exception;
}
