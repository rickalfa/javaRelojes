/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojbd;

/**
 *
 * @author Alumnos
 */



import model.Reloj;

import controllers.ControllerReloj;

import views.ViewReloj;

import views.viewRelojFra;

public class Relojbd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         ControllerReloj Relojes = new ControllerReloj();
      
        Reloj relojobj = new Reloj(0,12,33,54);
        
        Relojes.crearNuevoReloj(relojobj);
        
        System.out.println(Relojes.getRelojes());
        
        Reloj relojobj2 = Relojes.showRelojindex(0);
        
        System.out.print("programa de la evaluacion 02 \n ");
        
        System.out.printf("hora del reloj %d", relojobj2.getHora());
   
        
        new viewRelojFra().setVisible(true);
        
        
        
      
        
        
        
        
    }
    
}
