/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.BookDTO;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface BookService extends SuperService{
    String save(BookDTO dto) throws Exception;
    String update(BookDTO dto) throws Exception;
    String delete(String code) throws Exception;
    BookDTO get(String code) throws Exception;
    BookDTO getById(int id) throws Exception;
    ArrayList<BookDTO> getAll() throws Exception;
}
