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
        if(hora >= 0 && hora < 24)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    
    public static boolean validateMinuto(int minuto)
    {
        if(minuto >=  0 && minuto < 61)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    
    
    public static boolean validateSegundos(float segundos)
    {
        if(segundos >=  0 && segundos < 61)
        {
            return true;
            
        }else{
            
            return false;
            
        }
        
        
    }
    
    public static boolean validateInputStrHora(String _hora)
    {
        boolean validateinputHora;
        
        String horaSinespacios = _hora;
         horaSinespacios = horaSinespacios.replaceAll("\\s+", "");///ELIMINAMOS LOS ESPACIOS
        
         
         if(ControllerValidateInput.validateInputInteger(horaSinespacios )){
           
           int horaInt = Integer.parseInt(horaSinespacios);
           
           if(ControllerValidateInput.validateHora(horaInt )){
               
                validateinputHora = true;
               
            }else{  validateinputHora = false;}
       }else{validateinputHora = false;}
        
         return validateinputHora;
         
    }
    
    public static boolean validateInputStrMinuto(String _minuto)
    {
        String minutoSinespacios = _minuto;
          minutoSinespacios = minutoSinespacios.replaceAll("\\s+", "");///ELIMINAMOS LOS ESPACIOS
   
        boolean validateinputMinuto;
        
              if(ControllerValidateInput.validateInputInteger(minutoSinespacios )){
           
           int minuto = Integer.parseInt(minutoSinespacios);
           if(ControllerValidateInput.validateMinuto(minuto)){
               
               validateinputMinuto = true;
               
           }else{  validateinputMinuto = false;}
        }else{validateinputMinuto = false;}
        
        
        return validateinputMinuto;
        
    }
    
    public static boolean validateInputStrSegundos(String _segundos)
    {
        String segundoSinespacios = _segundos;
         segundoSinespacios = segundoSinespacios.replaceAll("\\s+", "");///ELIMINAMOS LOS ESPACIOS
        boolean validateinputSegundos;
         
        if(ControllerValidateInput.validateInputInteger(segundoSinespacios )){
           
           float segundos = Integer.parseInt(segundoSinespacios);
           if(ControllerValidateInput.validateSegundos(segundos)){
               
               validateinputSegundos = true;
               
           }else{  validateinputSegundos = false;}
        }else{validateinputSegundos = false;}
       
        return validateinputSegundos;
        
    }
    
}
