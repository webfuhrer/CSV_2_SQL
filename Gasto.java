/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csv2bd;

/**
 *
 * @author CDMFP
 */
public class Gasto {
    private String nombre;
    private int cantidad;

    public Gasto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", cantidad=" + cantidad ;
    }
    
}
