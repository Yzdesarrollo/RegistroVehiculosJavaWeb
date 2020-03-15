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
public class Contrato implements Serializable {
    
    private int id;
    private String idV;
    private int idC;

    public Contrato() {
    }

    public Contrato(int id, String idV, int idC) {
        this.id = id;
        this.idV = idV;
        this.idC = idC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdV() {
        return idV;
    }

    public void setIdV(String idV) {
        this.idV = idV;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }  
}
