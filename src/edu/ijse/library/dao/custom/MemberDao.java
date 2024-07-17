/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.MemberEntity;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface MemberDao extends SuperDAO{
    String save(MemberEntity entity) throws Exception;
    String update(MemberEntity entity) throws Exception;
    String delete(String code) throws Exception;
    MemberEntity get(String code) throws Exception;
    MemberEntity getById(int id) throws Exception;
    ArrayList<MemberEntity> getAll() throws Exception;
}
