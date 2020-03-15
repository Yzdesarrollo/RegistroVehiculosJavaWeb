/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Vehiculo;

/**
 *
 * @author yeison.ariel
 */
public class vehiculoDAO {
    
    public static boolean insertarV (Vehiculo vh){
    
        try
        {
            Connection cone = conexionLib.conectarnosDB();
            String SQL = "INSERT INTO vehiculo(placa,marca,referencia,modelo,id_tv) VALUES (?,?,?,?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);
            
            ps.setString(1,vh.getPlaca());
            ps.setString(2,vh.getMarca());
            ps.setString(3,vh.getRef());
            ps.setInt(4,vh.getModelo());
            ps.setInt(5,vh.getIdTv());
            
            return ps.executeUpdate() > 0;
        }
        catch (SQLException ex)
        {
            return false;
        }
        
    }
}
