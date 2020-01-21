/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csv2bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
class AccesoBD {
private static Connection conexion=null;
private static Statement stmt=null;
private static void inicializarBD()
{
    try {
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_gastos", "root", "");
        stmt=conexion.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    static void insertarGastos(ArrayList<Gasto> lista) {
        inicializarBD();
        for (Gasto g : lista) {
            String sql="INSERT INTO t_gastos VALUES ('"+g.getNombre()+"', "+g.getCantidad()+")";
            try {
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
