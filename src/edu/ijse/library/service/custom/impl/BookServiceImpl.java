/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.dto.BookDTO;
import edu.ijse.library.entity.BookEntity;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class BookServiceImpl implements BookService{
    
    private BookDao dao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.BOOK);

    @Override
    public String save(BookDTO dto) throws Exception {
        BookEntity entity = new BookEntity(dto.getbCode(), dto.getTitle(), dto.getAuthor(), dto.getPublisher(), dto.getPublishDate(), dto.getDescription(), dto.getQty(), dto.getCid());
        return dao.save(entity);
    }

    @Override
    public String update(BookDTO dto) throws Exception {
        BookEntity entity = new BookEntity(dto.getbCode(), dto.getTitle(), dto.getAuthor(), dto.getPublisher(), dto.getPublishDate(), dto.getDescription(), dto.getQty(), dto.getCid());
        return dao.update(entity);
    }

    @Override
    public String delete(String code) throws Exception {
        return dao.delete(code);
    }

    @Override
    public BookDTO get(String code) throws Exception {
        BookEntity entity = dao.get(code);
        BookDTO dto = new BookDTO(entity.getbCode(), entity.getTitle(), entity.getAuthor(), entity.getPublisher(), entity.getPublishDate(), entity.getDescription(), entity.getQty(), entity.getCid());
        return dto;
    }

    @Override
    public ArrayList<BookDTO> getAll() throws Exception {
        ArrayList<BookEntity> entityList = dao.getAll();
        ArrayList<BookDTO> dtoList = new ArrayList<>();
        
        for(BookEntity entity : entityList){
            BookDTO dto = new BookDTO(entity.getBid(), entity.getbCode(), entity.getTitle(), entity.getAuthor(), entity.getPublisher(), entity.getPublishDate(), entity.getDescription(), entity.getQty(), entity.getCid());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
