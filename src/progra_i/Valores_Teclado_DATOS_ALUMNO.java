/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package progra_i;
import java.util.Scanner;
/**
 *
 * @author Laura Sabillon
 */
public class Valores_Teclado_DATOS_ALUMNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Datos de Alumno - Desde Teclado
        
        //Llamar la clase Scanner
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        int cuentaAlumno, edad;
        String nombreAlumno, apellidoAlumno , apro_rep = "NOTA INVALIDA";
        double nota1, nota2, nota3, promedio;
        
        System.out.println("Favor ingresar su numero de Cuenta:");
        cuentaAlumno = scan.nextInt();
        
        System.out.println("Favor ingresar su primer nombre: ");
        nombreAlumno = scan.next();
        
        System.out.println("Favor ingresar su apellido:");
        apellidoAlumno = scan.next();
        
        System.out.println("Favor ingresar su edad: ");
        edad = scan.nextInt();
        
        System.out.println("Favor ingresar su nota final #1:");
        nota1 = scan.nextDouble();
        
        System.out.println("Favor ingresar su nota final #2:");
        nota2 = scan.nextDouble();
        
        promedio = (nota1+nota2)/2;
        
        /*
        1.- menor que 59.5 - Insuficiente
        2.- mayor e igual que 59.5 hasta 80 - notable
        3.- mayor que 80 hasta 90 - Muy bueno
        4.- mayor 90 hasta 100 - Excelente
        */
        
        if (promedio < 59.5 && promedio > 0){
            apro_rep = "Insuficiente";
        }
        else if (promedio >= 59.5 && promedio <= 80){
            apro_rep = "Notable";
        }else if (promedio > 80 && promedio<=90){
            apro_rep = "Muy Bueno";
        }else if (promedio > 90 && promedio <= 100){
            apro_rep = "Excelente";
        }
        
        System.out.println("\n *********** BOLETA DE ALUMNO *************");
        System.out.println("Numero de Cuenta: " + cuentaAlumno + 
                           "\nNombre de Alumno: " + nombreAlumno + " " + apellidoAlumno +
                           "\nEdad: " + edad +
                           "\nPromedio: " + promedio + " % - " + apro_rep);
         }
}
