/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.CategoryEntity;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface CategoryDao extends SuperDAO{
    
    String save(CategoryEntity entity) throws Exception;
    String update(CategoryEntity entity) throws Exception;
    String delete(String code) throws Exception;
    CategoryEntity get(String code) throws Exception;
    ArrayList<CategoryEntity> getAll() throws Exception;
    
}
