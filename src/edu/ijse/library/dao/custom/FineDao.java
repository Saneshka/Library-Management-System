/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.FineEntity;

/**
 *
 * @author hirus
 */
public interface FineDao extends SuperDAO{
    String save(FineEntity entity) throws Exception;
    String payFine(int lid) throws Exception;
}
