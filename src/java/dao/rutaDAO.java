/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Ruta;

/**
 *
 * @author yeison.ariel
 */
public class rutaDAO {
    
    public static boolean insertarR (Ruta R)
    {
        try
        {
            Connection cone = conexionLib.conectarnosDB();
            
            String SQL = "INSERT INTO ruta (id,nombre,id_vehiculo) VALUES (?,?,?)";
            
            PreparedStatement ps = cone.prepareStatement(SQL);
            
            ps.setInt(1,R.getIdR());
            ps.setString(2,R.getNombre());
            ps.setString(3,R.getIdVh());
            
            return ps.executeUpdate() > 0;
        }
        catch(SQLException ex) 
        {
                return false;
        }
    }
}
