/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author rb__s
 */
public class ControllerValidateInput {
    
    
    
    public static boolean validateInputInteger(String inputdatestr)
    {
        /**
         *  quitamos los espacios
         */
        
        if(inputdatestr != "")
        {
        
           String localdate = inputdatestr.replaceAll("\\s+", "");
           int datefilter;
        
          try{
      
               datefilter = Integer.parseInt(localdate);        
            
            } catch(Exception e)
              {
            
            
                return false;
            
              }
         
        
          return true;
        
        }else{
            /// retornamos false si el string esta vacio ""
        return false;
        }
    }
    
    
    public static boolean validateHora(int hora)
    {
        if(hora > 0 && hora < 25)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    
    public static boolean validateMinuto(int minuto)
    {
        if(minuto > 0 && minuto < 61)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    
    
    public static boolean validateSegundos(float segundos)
    {
        if(segundos > 0 && segundos < 61)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    
}
