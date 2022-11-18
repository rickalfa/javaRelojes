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
    
    public  String[][] ObtenerTodosRelojes()
    {
        
        String ElementRow[][] = new String[100][4];
        int countmax = 0;
        int count = 0; 
        int i = 0;
          
        String querysql = "select * from reloj";
        
        try{
            
        ResultSet resultquery = Conndb.ejecutarQueryResult(querysql);
        
        System.out.print(" DONE Query Select * : \n");
        
      
        
       
        while(resultquery.next())
        {
            
            //System.out.println("Hora : "+resultquery.getString("hora") );
            //System.out.println("minuto : "+resultquery.getString("minuto") );
            //System.out.println("segundos : "+resultquery.getString("segundos")+ "\n" );
            
             ElementRow[count][0] =  resultquery.getString("id_reloj");
             ElementRow[count][1] =  resultquery.getString("hora");
             ElementRow[count][2] =  resultquery.getString("minuto");
             ElementRow[count][3] =  resultquery.getString("segundos");
             
             
             System.out.println("id_reloj : "+ElementRow[count][0] );
             System.out.println("hora : "+ElementRow[count][1] );
             System.out.println("minuto : "+ElementRow[count][2] );
              System.out.println("Segundos : "+ElementRow[count][3] );
            
            count += 1;
        }
        
        countmax = count;
        
        System.out.print(countmax);
        
        String[][] matrizResult = new String[count][4];
        //resultquery.getArray(1);
       
        //System.out.print(resultquery.getArray(1).toString());
        
        while(i < count)
        {
               
            matrizResult[i][0] = ElementRow[i][0];
            matrizResult[i][1] = ElementRow[i][1];
            matrizResult[i][2] = ElementRow[i][2];
            matrizResult[i][3] = ElementRow[i][3];
            
            i +=1;
               
        }
        
        
        
        return matrizResult;
        
        }catch(Exception e){
        
            System.out.print(" fallo en la Query Select *\n");
            System.out.print(e);
            
            return null;
           
        }
        
        
    }
    
    
    public int EliminarRelojDB( int index)
    {
        
        String indexstr = String.valueOf(index);
        
        String querysql = "delete from reloj where id_reloj='"+indexstr+"' ";
        
        
        try{
        
            Conndb.ejecutarQuery(querysql);
            
            
            return 1;
        
        }catch(Exception e){
        
            
            System.out.println(e);
            
            return 0;
        
        }
        
        
    }
    
    public int ActualizarRelojdb(int id_reloj, int hora, int minuto , int segundos)
    {
        String indexstr = String.valueOf(id_reloj);
        
        String horastr = String.valueOf(hora);
        String minutostr = String.valueOf(minuto);
        String segundosstr = String.valueOf(segundos);
        
        
        
        String querysql = "update reloj set hora='"+horastr+"', minuto='"+minutostr+"', segundos='"+segundosstr+"' where id_reloj='"+id_reloj+"' ";
        
        
        try{
        
            Conndb.ejecutarQuery(querysql);
            
            System.out.print("la query UPDATE DONE ¡¡");
            
            return 1;
        
        }catch(Exception e){
        
            System.out.print("la query UPDATE FAIL ¡¡");
            
            System.out.println(e);
            
            return 0;
        
        }
        
        
    }
    
}
