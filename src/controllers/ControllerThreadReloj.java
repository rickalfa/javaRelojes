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
    
    private Thread h2;
    
    public ControllerThreadReloj(){
    
        hora = 0;
        minuto = 0;
        segundos = 0;
        
        h2 = new Thread(this);
        
       
    
    }
    
    public void startRelojCount()
    {
         h2.start();
    
        
    }
    
    public String showformatStrReloj()
    {
       String formatReloj = "";
       
       String ceroSeg = "";
       String ceroMinuto = "";
       String ceroHora = "";
       String pm_am_str = "";
       
       ceroSeg = (segundos < 10 )?"0":"";
       ceroMinuto =(minuto < 10 )?"0":"";
       ceroHora = (hora < 10 )?"0":"";
       pm_am_str = (hora > 12)?"PM":"AM";
       
       formatReloj = pm_am_str +" - "+ceroHora+hora+":"+ceroMinuto+minuto+":"+ceroSeg+segundos;
       
       return formatReloj;
        
        
    }
    
    private void calcularTiempo()
    {
        
        if( segundos > 58 )
        { 
            segundos = -1;
            minuto += 1;
            
        }
        
        if( minuto > 59)
        {
            minuto = 0;
            hora += 1;
        }
        
        if(hora > 23 ){
        
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
        
            System.out.print(segundos);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
