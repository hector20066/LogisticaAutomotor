/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author Mi PC
 */
public class Principal {
    
    public static void main(String[]args){
        
        Automotor vista = new Automotor();
        ReporteVehiculos reporte = new ReporteVehiculos();
        
        vista.setReportes(reporte);
        reporte.setAutomor(vista);
        
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        
    }
}
