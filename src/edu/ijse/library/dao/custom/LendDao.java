/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.entity.LendEntity;
import java.util.ArrayList;

/**
 *
 * @author hirus
 */
public interface LendDao extends SuperDAO{
    
    String LendBook(LendEntity entity) throws Exception;
    ArrayList<LendEntity> getAll() throws Exception;
}
