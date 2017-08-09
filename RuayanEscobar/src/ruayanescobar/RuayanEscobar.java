/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruayanescobar;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class RuayanEscobar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    System.out.println("Ruayan Escobar");
    System.out.println("5to. BACO A");
    //usuario
    String nombre="";
    int edad; System.out.println("ingrese nombre");
        Scanner D1 = new Scanner(System.in);
        nombre = D1.nextLine ();
        System.out.println("ingrese edad");
        Scanner D2 = new Scanner(System.in);
        edad = D2.nextInt();
        
        //condicional if
        //ciclo
        if(edad>=18) {
        System.out.println("tieneDPI");
         }else{
           System.out.println("es menor de edad");
       }     
        
        }        
    
    }
    
}
