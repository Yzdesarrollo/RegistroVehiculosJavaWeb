/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author yeison.ariel
 */
public class Ruta implements Serializable {
    
    private int idR;
    private String nombre;
    private String idVh;

    public Ruta() {
    }

    public Ruta(int idR, String nombre, String idVh) {
        this.idR = idR;
        this.nombre = nombre;
        this.idVh = idVh;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdVh() {
        return idVh;
    }

    public void setIdVh(String idVh) {
        this.idVh = idVh;
    }
    
}
