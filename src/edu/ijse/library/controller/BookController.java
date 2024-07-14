/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.BookDTO;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class BookController {
    
    private BookService bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.BOOK);
    
    public String save(BookDTO dto) throws Exception{
        return bookService.save(dto);
    }
    public String update(BookDTO dto) throws Exception{
        return bookService.update(dto);
    } 
    public String delete(String code) throws Exception{
        return bookService.delete(code);
    }
    public BookDTO get(String Code) throws Exception{
        return bookService.get(Code);
    }
    public ArrayList<BookDTO> getAll() throws Exception{
        return bookService.getAll();
    }
    
}
