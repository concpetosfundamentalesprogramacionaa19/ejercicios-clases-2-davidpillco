/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class miEjercicio {
    public static void main(String[] args) {
    String nombre;
    String apellido;
    String ciudad;
    String pais;
    int edad;
    int nota1;
    int nota2;
    double prom;
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Ingrese sus nombres");
    nombre = entrada.nextLine();
    System.out.println("Ingrese sus apellidos");
    apellido = entrada.nextLine(); 
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt(); 
    entrada.nextLine();
    System.out.println("Ingrese su ciudad");
    ciudad = entrada.nextLine();
    System.out.println("Ingrese su pais");
    pais = entrada.nextLine();
    System.out.println("Ingrese la primera nota");
    nota1 = entrada.nextInt();
    System.out.println("Ingrese la segunda nota");
    nota2 = entrada.nextInt();
    prom = (nota1+ nota2)/2;
    
    System.out.printf("Sus nombres y apellidos: %s %s\nEdad: %s\nCiudad:%s\n"
            + "Pais: %s\nNotas: %s %s\nPromedio:%s", nombre,apellido,edad,
            ciudad,pais,nota1,nota2,prom);
    
    }
}
