/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;
import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.CategoryDao;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.entity.CategoryEntity;
import edu.ijse.library.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author hirus
 */
public class CategoryDaoImpl implements CategoryDao{

    @Override
    public String save(CategoryEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO category VALUES (?,?,?,?)", 0, entity.getcCode(), entity.getCategoryName(), entity.getDescription());
        return isSaved ? "Successfully Saved" : "Failed to Save";
    }

    @Override
    public String update(CategoryEntity entity) throws Exception {
        boolean isUpdated  = CrudUtil.executeUpdate("UPDATE category SET categoryName = ?, description = ? WHERE cCode = ?", entity.getCategoryName(), entity.getDescription(), entity.getcCode());
        return isUpdated ? "Successfully Updated" : "Failed to Update";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted  = CrudUtil.executeUpdate("DELETE FROM category WHERE cCode = ?", code);
        return isDeleted ? "Successfully Deleted" : "Failed to Delte";
    }

    @Override
    public CategoryEntity get(String code) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM category WHERE cCode = ?", code);
        if (rest.next()) {
            CategoryEntity entity = new CategoryEntity(rest.getInt("cid"), rest.getString("cCode"), rest.getString("categoryName"), rest.getString("description"));
            return entity;   
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM category");
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        
        while (rest.next()) {            
            CategoryEntity entity = new CategoryEntity(rest.getInt("cid"), rest.getString("cCode"), rest.getString("categoryName"), rest.getString("description"));
            categoryEntities.add(entity);
        }
        return categoryEntities;
    }

    @Override
    public CategoryEntity getById(int id) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM category WHERE cid = ?", id);
        if (rest.next()) {
            CategoryEntity entity = new CategoryEntity(rest.getInt("cid"), rest.getString("cCode"), rest.getString("categoryName"), rest.getString("description"));
            return entity;
        }
        return null;
    }


}
