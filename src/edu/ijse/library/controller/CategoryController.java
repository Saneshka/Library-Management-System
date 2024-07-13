/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.CategoryDTO;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class CategoryController {
    
    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.CATEGORY);
    
    public String save(CategoryDTO dto) throws Exception{
        return categoryService.save(dto);
    }
    public String update(CategoryDTO dto) throws Exception{
        return categoryService.update(dto);
    }
    public String delete(String code) throws Exception{
        return categoryService.delete(code);
    }
    public CategoryDTO get(String code) throws Exception{
        return categoryService.get(code);
    }
    public ArrayList<CategoryDTO> getAll() throws Exception{
        return categoryService.getAll();
    }
    
}
