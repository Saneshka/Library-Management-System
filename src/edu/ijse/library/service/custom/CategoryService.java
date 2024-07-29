/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.CategoryDTO;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface CategoryService extends SuperService{
    
    String save(CategoryDTO dto) throws Exception;
    String update(CategoryDTO dto) throws Exception;
    String delete(String code) throws Exception;
    CategoryDTO get(String code) throws Exception;
    CategoryDTO getById(int id) throws Exception;
    ArrayList<CategoryDTO> getAll() throws Exception;
}
