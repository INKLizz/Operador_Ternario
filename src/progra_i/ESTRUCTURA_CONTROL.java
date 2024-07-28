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
public class ESTRUCTURA_CONTROL {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int resultado= 0, limite, contador = 0, imprimir, suma = 0;
        
        System.out.println("Tabla a imprimir: ");
        imprimir = scan.nextInt();
        
         // ---- WHILE LOOP -----
        System.out.println("Favor ingresar un limite para la tabla: ");
        limite = scan.nextInt();
        
        System.out.println("\nTabla: ");
        while (contador < limite){
            contador ++;            
            resultado = contador*imprimir;
            System.out.println( imprimir + " x " + contador + " = " + resultado );
            suma = suma + resultado;
        }
        System.out.println("Suma total: " + suma);
        
        /*
        ---- DO WHILE LOOP ----
        
        do{
            contador ++;
            resultado = contador*imprimir;
            System.out.println( imprimir + " x " + contador + " = " + resultado );            
        }while( contador < 12);
        
        ---- FOR LOOP ----
        
        for (int index = 1; index < 12; index++){
            resultado = index*imprimir;
            System.out.println( imprimir + " x " + index + " = " + resultado );            
        }
       */ 
        
    }
}
