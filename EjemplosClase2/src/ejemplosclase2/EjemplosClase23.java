/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor ingrese sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Por favor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese la edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza de buffer de entrada de datos
        System.out.println("Por favor ingrese la ciudad");
        ciudad = entrada.nextLine();
        
        System.out.print("Su nombre es: "+nombre+"\n"+"\n"
                + "\t"+"Su apellido es: "+apellido+ ", edad: " +edad +"\n"
        +"Ciudad: " + ciudad);
    }
    
}
