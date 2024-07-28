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
public class boleta_pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int horas = 0, horas_extra = 0;
        double tarifa = 61.45, tarifa_extra = 71.25, pago = 0, pago_extra = 0, sueldo_base = 0, sueldo_neto = 0;
        String nombre;
        
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        System.out.println("Favor ingresar su nombre: ");
        nombre = scan.next();
        System.out.println("Favor ingresar las hora laboradas: ");
        horas = scan.nextInt();
        
        while (horas <= 0){
            if (horas == 0){
                System.out.println("Tiene que ingresar las horas.");
            }else if (horas < 0){
                System.out.println("Horas negativas no existen.");
            }
            horas = scan.nextInt();            
        }
        
        if (horas > 40 && horas <= 60){
            horas_extra = horas - 40;
            horas = 40;
        }else if (horas > 60){
            horas_extra = 20;
            horas = 40;
        }
        pago = horas*tarifa;
        pago_extra = horas_extra*tarifa_extra;
        sueldo_base = pago;
        sueldo_neto = pago + pago_extra;
        
        System.out.println(" *** BOLETAS DE PAGO ***"
                + "\n Nombre de Empleado: " + nombre +
                "\n Horas Elaboradas: " + horas +
                "\n Sueldo Base: " + sueldo_base + 
                "\n Horas Extra: " + horas_extra+
                "\n Pago Extra: " + pago_extra+
                "\n Sueldo Neto: " + sueldo_neto);
    }
}
