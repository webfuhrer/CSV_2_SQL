/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csv2bd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
class AccesoFichero {

    static ArrayList<Gasto> recuperarGastos() {
        ArrayList<Gasto> lista_gastos=new ArrayList<>();
        try {
            FileReader fr=new FileReader("C:\\LUIS\\gastos.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] datos=linea.split(",");
                String nombre=datos[0];
                String str_cantidad=datos[1];
                int cantidad=Integer.parseInt(str_cantidad);
                Gasto g=new Gasto(nombre, cantidad);
                lista_gastos.add(g);
                linea=br.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lista_gastos;
    }
    
}
