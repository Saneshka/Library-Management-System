/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author hirus
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public String save(MemberEntity entity) throws Exception {
        
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member VALUES (?,?,?,?,?,?)", 0,entity.getmCode(), entity.getFirstName(), entity.getLastName(), entity.getPhoneNo(), entity.getAddress());
        return isSaved ? "Saved Successfully" : "Failed to Save";
    }

    @Override
    public String update(MemberEntity entity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE member SET  firstName = ?, lastName = ?, phoneNo = ?, address = ? WHERE mcode = ?", entity.getFirstName(), entity.getLastName(), entity.getPhoneNo(), entity.getAddress(), entity.getmCode());
        return isUpdated ? "Updated Successfully" : "Failed to Update";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM member WHERE mCode = ?", code);
        return isDeleted ? "Deleted Successfully" : "Failed to Delete";
    }

    @Override
    public MemberEntity get(String code) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM member WHERE mCode = ?", code);
        if (rest.next()) {
            MemberEntity entity = new MemberEntity(rest.getInt("mid"), rest.getString("mCode"), rest.getString("firstName"), rest.getString("lastName"), rest.getString("phoneNo"), rest.getString("address"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM member");
        ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        
        while (rest.next()){
            MemberEntity entity = new MemberEntity( rest.getString("mCode"), rest.getString("firstName"), rest.getString("lastName"), rest.getString("phoneNo"), rest.getString("address")  );
           memberEntities.add(entity);
        }
        return memberEntities;
    }

    @Override
    public MemberEntity getById(int id) throws Exception {
        ResultSet rest = CrudUtil.executeQuary("SELECT * FROM member WHERE mid = ?", id);
        if (rest.next()) {
            MemberEntity entity = new MemberEntity(rest.getInt("mid"), rest.getString("mCode"), rest.getString("firstName"), rest.getString("lastName"), rest.getString("phoneNo"), rest.getString("address"));
            return entity;
        }
        return null;
    }
    
}
