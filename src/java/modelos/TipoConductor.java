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
public class TipoConductor implements Serializable {
    
    // Atributos - Propiedades
    private int IdTipoConductor;
    private String NomTipoConductor;

    public TipoConductor() {
    }

    public TipoConductor(int IdTipoConductor, String NomTipoConductor) {
        this.IdTipoConductor = IdTipoConductor;
        this.NomTipoConductor = NomTipoConductor;
    }

    public int getIdTipoConductor() {
        return IdTipoConductor;
    }

    public void setIdTipoConductor(int IdTipoConductor) {
        this.IdTipoConductor = IdTipoConductor;
    }

    public String getNomTipoConductor() {
        return NomTipoConductor;
    }

    public void setNomTipoConductor(String NomTipoConductor) {
        this.NomTipoConductor = NomTipoConductor;
    }
    
    
}
