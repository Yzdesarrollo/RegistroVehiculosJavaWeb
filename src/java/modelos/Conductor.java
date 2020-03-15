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
public class Conductor implements Serializable {
    
    private int idconduc;
    private String nomC;
    private String tipoL;
    private String idVh;
    private int idTC;

    public Conductor() {
    }

    public Conductor(int idconduc, String nomC, String tipoL, String idVh, int idTC) {
        this.idconduc = idconduc;
        this.nomC = nomC;
        this.tipoL = tipoL;
        this.idVh = idVh;
        this.idTC = idTC;
    }

    public int getIdconduc() {
        return idconduc;
    }

    public void setIdconduc(int idconduc) {
        this.idconduc = idconduc;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getTipoL() {
        return tipoL;
    }

    public void setTipoL(String tipoL) {
        this.tipoL = tipoL;
    }

    public String getIdVh() {
        return idVh;
    }

    public void setIdVh(String idVh) {
        this.idVh = idVh;
    }

    public int getIdTC() {
        return idTC;
    }

    public void setIdTC(int idTC) {
        this.idTC = idTC;
    }
}
