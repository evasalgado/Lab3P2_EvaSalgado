/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_evasalgado;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
/**
 *
 * @author evaja
 */
public class Lab3P2_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    ArrayList vehiculos = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        while (opcion!=7) {            
            System.out.println("---MENU---\n"
                + "1. Agregar Automovil\n"
                    + "2. Agregar Motocicleta\n"
                    + "3. Agregar Autobus\n"
                    + "4. Modificar Vehiculo\n"
                    + "5. Elmininacion\n"
                    + "6. Mostrar Vehiculo\n"
                    + "7. Generar Boleta\n");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4: 
                    break;
                case 5: 
                    break;
                case 6:
                    break;
                case 7: 
                    opcion=7;
                    break;
                default:
                    System.out.println("Ingrese numero valido");
                    break;
            }
        }
        
    }
    
}
