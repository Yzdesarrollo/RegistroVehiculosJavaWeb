/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Conductor;

/**
 *
 * @author yeison.ariel
 */
public class conductorDAO {
    
     public static boolean insertarCon(Conductor cd){
    
        try 
        {
            
            Connection cone = conexionLib.conectarnosDB();
            
            String SQL = "INSERT INTO conductor (id,nombre,tipo_licencia,id_vehiculo,id_tipo_conductor) VALUES (?,?,?,?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);
            
            ps.setInt(1,cd.getIdconduc());
            ps.setString(2,cd.getNomC());
            ps.setString(3,cd.getTipoL());
            ps.setString(4,cd.getIdVh());
            ps.setInt(5,cd.getIdTC());
           
            
            return ps.executeUpdate() > 0;
        }
        catch (SQLException ex){
            
            return false;
        }
    }
    
}
