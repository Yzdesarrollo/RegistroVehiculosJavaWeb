/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Contrato;

/**
 *
 * @author yeison.ariel
 */
public class contratoDAO {
    
    public static boolean insertarCon(Contrato ct){
    
        try 
        {
            
            Connection cone = conexionLib.conectarnosDB();
            
            String SQL = "INSERT INTO contrato (id,id_vehiculo,id_conductor) VALUES (?,?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);
            
            ps.setInt(1,ct.getId());
            ps.setString(2,ct.getIdV());
            ps.setInt(3,ct.getIdC());
           
            
            return ps.executeUpdate() > 0;
        }
        catch (SQLException ex){
            
            return false;
        }
    }
}
