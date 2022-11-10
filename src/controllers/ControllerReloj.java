/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package controllers;

import model.Reloj;

import java.util.ArrayList;


/**
 *
 * @author Alumnos
 */
public class ControllerReloj {

    private ArrayList<Reloj> Relojes;
    
    
    /**
     *  CONTRUCTOR
     */
    public ControllerReloj()
    {
        Reloj Relojobj = new Reloj();
        
        this.Relojes = new ArrayList<Reloj>();
        
    }
    
    
        /**
     * @return the Relojes
     */
    public ArrayList<Reloj> getRelojes() {
        return Relojes;
    }

    /**
     * @param Relojes the Relojes to set
     */
    public void setRelojes(ArrayList<Reloj> Relojes) {
        this.Relojes = Relojes;
    }
    
        
    public Reloj showRelojindex(int index)
    {
        Reloj relojlocal = this.Relojes.get(index);
        
        return relojlocal;
        
    }
    
    public void crearNuevoReloj(Reloj add_reloj)
    {
 
        this.getRelojes().add(add_reloj);
        
    }
    
    public void eliminarReloj(int index)
    {
        this.Relojes.remove(index);
       
    }
    
    public void actualizarReloj(int index, Reloj relojupdate)
    {
        
        this.Relojes.set(index, relojupdate);
        
    }
    
    
    public int GetRelojesSize()
    {
        int size = this.Relojes.size();
        
        return size;
        
    }
    
    
    
}
