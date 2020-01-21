/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csv2bd;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Gasto> lista_gastos=AccesoFichero.recuperarGastos();
        AccesoBD.insertarGastos(lista_gastos);
    }
}
