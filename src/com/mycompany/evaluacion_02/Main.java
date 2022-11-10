/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.evaluacion_02;

/**
 *
 * @author Alumnos
 */

import model.Reloj;

import controllers.ControllerReloj;

import views.ViewReloj;

import views.viewRelojFra;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        ControllerReloj Relojes = new ControllerReloj();
      
        Reloj relojobj = new Reloj(0,12,33,54);
        
        Relojes.crearNuevoReloj(relojobj);
        
        System.out.println(Relojes.getRelojes());
        
        Reloj relojobj2 = Relojes.showRelojindex(0);
        
        System.out.print("programa de la evaluacion 02 \n ");
        
        System.out.printf("hora del reloj %d", relojobj2.getHora());
   
        
        new viewRelojFra().setVisible(true);
        
        
        
      
        // TODO code application logic here
    }
    
}
