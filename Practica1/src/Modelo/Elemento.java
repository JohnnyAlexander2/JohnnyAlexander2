/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Tipo;
import java.io.Serializable;

/**
 *
 * @author johnny
 */
public class Elemento implements Serializable{

    private String recomendacion;
    private Tipo tipo;

    public String getRecomendacion() {
        return this.recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return tipo + "  " + recomendacion;
    }

}
