/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.CategoryDao;
import edu.ijse.library.dto.CategoryDTO;
import edu.ijse.library.entity.CategoryEntity;
import edu.ijse.library.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao dao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.daoTypes.CATEGORY);

    @Override
    public String save(CategoryDTO dto) throws Exception {
        CategoryEntity entity = new CategoryEntity(dto.getcCode(), dto.getCategoryName(), dto.getDescription());
        return dao.save(entity);
    }

    @Override
    public String update(CategoryDTO dto) throws Exception {
        CategoryEntity entity = new CategoryEntity(dto.getcCode(), dto.getCategoryName(), dto.getDescription());
        return dao.update(entity);
    }

    @Override
    public String delete(String code) throws Exception {
        return dao.delete(code);
    }

    @Override
    public CategoryDTO get(String code) throws Exception {
        CategoryEntity entity = dao.get(code);
        CategoryDTO dto = new CategoryDTO(entity.getcCode(), entity.getCategoryName(), entity.getDescription());
        return dto;
    }

    @Override
    public CategoryDTO getById(int id) throws Exception {
        CategoryEntity entity = dao.getById(id);
        CategoryDTO dto = new CategoryDTO(entity.getCid(), entity.getcCode(), entity.getCategoryName(), entity.getDescription());
        return dto;
    }

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
        ArrayList<CategoryEntity> entityList = dao.getAll();
        ArrayList<CategoryDTO> dtoList = new ArrayList<>();

        for (CategoryEntity entity : entityList) {
            CategoryDTO dto = new CategoryDTO(entity.getCid(), entity.getcCode(), entity.getCategoryName(), entity.getDescription());
            dtoList.add(dto);
        }
        return dtoList;
    }

}
