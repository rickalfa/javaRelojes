/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package controllers;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Reloj;
import model.ConnDb;



/**
 *
 * @author Alumnos
 */
public class ControllerConMysql {
    
    private Reloj RelojDb;
    
    private ConnDb Conndb;
    
    
    public ControllerConMysql()
    {
        
        Conndb = new ConnDb();
        
        
    }
    
    public int CrearRelojDb(int hora, int minuto, int segundos)
    {
        
        String horastr = String.valueOf(hora);
        String minutostr = String.valueOf(minuto);
        String segundosstr = String.valueOf(segundos);
        
        
       String querysql = "insert into reloj(hora, minuto, segundos) values('"+hora+"','"+minuto+"','"+segundos+"' )";
        
       System.out.print("\n query insert : "+querysql + "\n");
       
        try{
        
            Conndb.ejecutarQuery(querysql);
            
            return 1;
            
        }catch(Exception e){
        
            return 0;
        }
        
       
        
    }
    
    public void ObtenerTodosRelojes()
    {
        
        String querysql = "select * from reloj";
        
        try{
            
        ResultSet resultquery = Conndb.ejecutarQueryResult(querysql);
        
        System.out.print(" DONE Query Select * : \n");
        
        //resultquery.getArray(1);
       
        //System.out.print(resultquery.getArray(1).toString());
        
        while(resultquery.next())
        {
            
            System.out.println(resultquery.getString("hora") );
            System.out.println(resultquery.getString("minuto") );
            System.out.println(resultquery.getString("segundos") );
            
        }
        
        
        
        }catch(Exception e){
        
            System.out.print(" fallo en la Query Select *\n");
            System.out.print(e);
           
        }
        
        
    }
    
    
    
    
    
}
