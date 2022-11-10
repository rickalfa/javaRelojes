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
public class Reloj {


   public Reloj()
   {
         this.hora = 22;
        this.minuto = 22;
        
        this.segundo = 60;
        
   }
    
    public Reloj(int idreloj, int hora, int minuto, float segundo)
    {
        this.idReloj = idreloj;
        
        this.hora = hora;
        
        this.minuto = minuto;
        
        this.segundo = segundo;
        
    }
    
    private int idReloj;
    
    private int hora;
    
    private int minuto;
    
    private float segundo;

   
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
    
    
    
    
}
