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
public class Operador_Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
        El operador ternario es como una operación condicional similar a la de la if-else,
        solo que en esta solo se requiere una linea de codigo. En si yo creo que este tipo 
        de estructura es mejor utilizada para condiciones mas simples y sencillas, ya que es
        algo dificil de leer con condiciones mas largas y complejas. También no es tan versatil como
        el if-else ya que parece solo poder manejar de buena manera condiciones más simples, 
        condiciones mas complejas son mas dificiles de leer.
        */
        
        Scanner scan = new Scanner(System.in);
        
        //VALORES CONSTANTES
        String fruta;
        
        System.out.println("Es la fruta una manzana?");
        System.out.println("Ingrese una fruta.");
        fruta = scan.next().toLowerCase();
        
        String resultado = (fruta.equals("manzana")) ? "La fruta es manzana." : "La fruta no es manzana.";
        
        System.out.println("Resultado: " + resultado);
        
        //Variables
        int numero_1, numero_2;
        
        System.out.println("\nNumero es mayor o menor?");
        System.out.println("Ingrese un numero: ");
        numero_1 = scan.nextInt();
        System.out.println("Ingrese otro numero: ");
        numero_2 = scan.nextInt();
        
        String resultado_2 = (numero_1 > numero_2) ? "Numero: " + numero_1 + " es mayor que " + numero_2 + "." :"Numero: " + numero_2 + " es mayor que " + numero_1 + ".";
        System.out.println("Resultado: " + resultado_2);

        //Con formulas
        int numero_a, numero_b;
        
        System.out.println("\nSi ambos numeros son iguales multiplicar de contrario dividir.");
        System.out.println("Ingrese un numero: ");
        numero_a = scan.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        numero_b = scan.nextInt();
        
        int resultado_3 = (numero_a == numero_b) ? (numero_a*numero_b) : (numero_a/numero_b); 
        
        System.out.println("Resultado: " + resultado_3);
        
        
    }
}
