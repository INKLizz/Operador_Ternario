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
public class numero_alto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int cantidad = 0, contador = 0;
        double promedio = 0, nota = 0, mayor = 0, menor = 0, total = 0;
        
        System.out.print("Ingrese cantidad: ");
        cantidad = scan.nextInt();

        while (contador < cantidad){
            contador++;
            System.out.print("Nota #" + contador + ": ");
            nota = scan.nextDouble();
            
            while(nota < 0 || nota > 100){
            System.out.print("Nota #" + contador + ": ");
            nota = scan.nextDouble();
            }
            
            total += nota;
          
            if (mayor < nota){
                menor = mayor;
                mayor = nota;
                
            }else{
                mayor = mayor;
                menor = nota;
            }             
        }
            promedio = total/cantidad;
            System.out.println("Promedio: " + promedio);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
    }
}
