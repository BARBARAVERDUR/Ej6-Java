/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author 54351
 */
public class ServicioCafetera {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        
         Cafetera c1 = new Cafetera();
         
         System.out.println("Ingrese la capacidad de la cafetera");
         c1.setCapacidadMaxima(leer.nextDouble());
         
         c1.setCantidadActual (c1.getCantidadActual() + c1.getCapacidadMaxima());
         
         return c1;
    }
    
   
    
    public void llenarTaza(Cafetera c1){
        
     System.out.println("Ingrese la capacidad de la taza");    
     int taza = leer.nextInt();
     
     if(c1.getCantidadActual() > taza){
       
         int restante = ( (int) Math.round(c1.getCantidadActual()) - taza); 
         System.out.println("La taza se llenó correctamente. Actualmente quedan " + restante + "ml en la cafetera.");
         
         // funciona bien
     }
     
     else if (c1.getCantidadActual()> 0 && c1.getCantidadActual() <= taza){
         int restante = ( taza - (int) Math.round(c1.getCantidadActual()) );
         System.out.println("La taza actualmente posee " + c1.getCantidadActual()+ "ml. Faltaron " + restante + "ml para llenar la taza.");
         
         // funciona bien
     }
     
     else {
         
         System.out.println("No hay café disponible para llenar la taza.");
         
         //funciona bien
     }
     
         
     }
     
    
    public void vaciarCafetera(Cafetera c1){
       
      c1.setCantidadActual(c1.getCantidadActual()* 0);
      System.out.println("Actualmente la cafetera está vacía.");
    }
    
    
     public void agregarCafe(Cafetera c1){
       
      System.out.println("Introduzca la cantidad de café que desea añadir.");  
      c1.setCantidadActual(leer.nextInt());
      
      if(c1.getCantidadActual() > c1.getCapacidadMaxima()){
        System.out.println("La cantidad ingresada supera la cantidad máxima permitida");
        
        //funciona bien
      }
      else if(c1.getCantidadActual() == c1.getCapacidadMaxima()){
          
         System.out.println("La cafetera se llenó completamente" ); 
         //funciona bien
      }
     else if(c1.getCantidadActual() < c1.getCapacidadMaxima()){
          
         System.out.println("Se agregaron " + c1.getCantidadActual() + " ml de " + c1.getCapacidadMaxima() + " ml." );  
         //funciona bien
      }
    }
}
