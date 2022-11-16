/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alumnos
 */

import java.util.*;

import model.ConnDb;

public class Reloj implements Runnable{

    private int idReloj;
    
    private int hora;
    
    private int minuto;
    
    private float segundo;
    
    private Thread Th1;
    
    private ConnDb ConexionDb;

    /**
     * Constructor
     */
   public Reloj()
   {
        this.hora = 22;
        this.minuto = 22;
        this.segundo = 60;
        
        ConexionDb = new ConnDb();
       
        
   }
    
   /**
    * CONSTRUCTOR SOBRECARGADO
    * @param idreloj
    * @param hora
    * @param minuto
    * @param segundo 
    */
    public Reloj(int idreloj, int hora, int minuto, float segundo)
    {
        this.idReloj = idreloj;
        
        this.hora = hora;
        
        this.minuto = minuto;
        
        this.segundo = segundo;
        
        this.Th1 = new Thread(this);
        
        Th1.start();
        
    }
    
  
    public void startRelojCount()
    {
       Th1.start();
        
    }
    
    
    private void calcularTiempo()
    {
      if( segundo > 58 )
        { 
            segundo = -1;
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
    
        /**
     * @return the idReloj
     */
    public int getIdReloj() {
        return idReloj;
    }

    /**
     * @param idReloj the idReloj to set
     */
    public void setIdReloj(int idReloj) {
        this.idReloj = idReloj;
    }

     
    ////  METODOS GET SETS
    public void setHora( int _hora)
    {
        this.hora = _hora;
        
    }
    
    public int getHora()
    {
        
        return this.hora;
        
    }
    
    public void setMinuto(int _minuto)
    {
        
        this.minuto = _minuto;
    }
    
    public int getMinuto()
    {
        
        return this.minuto;
        
    }
   
       /**
     * @return the segundo
     */
    public float getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(float segundo) {
        this.segundo = segundo;
    }

    @Override
    public void run() {
        
        
 
            int count = 0;
        
        while(count < 200 )
        {
            
            calcularTiempo();
            
            segundo += 1;
            
            count +=1;
            try{
                
            Thread.sleep(1000);
            
            }catch(InterruptedException e){}
        
           // System.out.print("\n segundos Reloj Tharray :"+segundo+ "\n");
            
        }
        
    
    }
    
    
    
    
}
