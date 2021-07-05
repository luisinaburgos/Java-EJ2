/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Luisina
 */
public class Usuario {
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor;
    String so;
    
    public Usuario(){};
    
    void mostrarUsuario(){
        String datos = "/Nombre:" +nombre+" /Apellido:"+apellido+" /Edad:"+edad+" /Hobbie:"+hobbie+" /Editor favorito:"+editor+" /Sistema Operativo:"+so;
        System.out.println(datos);
}


}