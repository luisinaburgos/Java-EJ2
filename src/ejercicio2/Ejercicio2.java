/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Luisina
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Usuario Luisina = new Usuario();
     
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingresa tu nombre:");
     Luisina.nombre=sc.next();
     System.out.println("Ingresa tu apellido:");
     Luisina.apellido=sc.next();
     System.out.println("Ingresa tu edad:");
     Luisina.edad=sc.nextInt();
     System.out.println("¿Cuál es tu hobbie?");
     Luisina.hobbie=sc.next();
     System.out.println("¿Cuál es tu editor de código preferido?");
     Luisina.editor=sc.next();
     System.out.println("¿Cuál es el sistema operativo que usás?");
     Luisina.so=sc.next();
     Luisina.mostrarUsuario();
       
    }
    
}
