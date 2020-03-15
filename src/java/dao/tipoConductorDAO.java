/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.TipoConductor;

/**
 *
 * @author yeison.ariel
 */
public class tipoConductorDAO {
    
    public static boolean insertartc (TipoConductor tc){
        try
        {
            Connection cone = conexionLib.conectarnosDB();
            
            String SQL = "INSERT INTO tipo_conductor (id,nombre) VALUES (?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);
            
            ps.setInt(1,tc.getIdTipoConductor());
            ps.setString(2,tc.getNomTipoConductor());
            
            return ps.executeUpdate() > 0;
        }
        catch (SQLException ex){
            return false;
        }
    }
}
