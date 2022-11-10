/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author rb__s
 */

import java.util.*;

public class ControllerThreadReloj implements Runnable {

    /**
     * @return the minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * @param minuto the minuto to set
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    private int hora;
    private int minuto;
    private int segundos;
    
    private Thread h1;
    
    public ControllerThreadReloj(){
    
        hora = 0;
        
        h1 = new Thread(this);
        
       
    
    }
    
    public void startRelojCount()
    {
         h1.start();
    
        
    }
    
    public String showformatStrReloj()
    {
       String formatReloj = "";
       
       String ceroSeg = "";
       
       ceroSeg = (segundos < 10 )?"0":"";
       
       formatReloj = ""+ceroSeg+segundos;
       
       return formatReloj;
        
        
    }
    
    private void calcularTiempo()
    {
        
        if( segundos > 60 )
        { 
            segundos = 0;
            minuto += 1;
            
        }
        
        if( minuto > 60)
        {
            minuto = 0;
            hora += 1;
        }
        
        if(hora > 24 ){
        
            hora = 0;
        }
        
    }
    
    
    @Override
    public void run() {
       
        int count = 0;
        
        while(count < 200 )
        {
            
             calcularTiempo();
            
            segundos += 1;
            count +=1;
            try{
                
            Thread.sleep(1000);
            
            }catch(InterruptedException e){}
        
            System.out.print(hora);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
