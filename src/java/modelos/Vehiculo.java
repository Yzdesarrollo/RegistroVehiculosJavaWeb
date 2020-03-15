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
public class Vehiculo implements Serializable {
    
    private String placa;
    private String marca;
    private String ref;
    private int modelo;
    private int IdTv;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String ref, int modelo, int IdTv) {
        this.placa = placa;
        this.marca = marca;
        this.ref = ref;
        this.modelo = modelo;
        this.IdTv = IdTv;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getIdTv() {
        return IdTv;
    }

    public void setIdTv(int IdTv) {
        this.IdTv = IdTv;
    }  
}
