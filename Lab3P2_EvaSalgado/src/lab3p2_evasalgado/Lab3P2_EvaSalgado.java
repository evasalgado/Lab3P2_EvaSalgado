/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_evasalgado;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;

/**
 *
 * @author evaja
 */
public class Lab3P2_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static ArrayList vehiculos = new ArrayList();

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        int opcion = 0;
        while (opcion != 7) {
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
                    agregarAutomovil();
                    break;
                case 2:
                    AgregarMotocicleta();
                    break;
                case 3:
                    AgregarAutobus();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    mostrarVehiculo();
                    break;
                case 7:
                    opcion = 7;
                    break;
                default:
                    System.out.println("Ingrese numero valido");
                    break;
            }
        }

    }

    public static void agregarAutomovil() throws ParseException {
        Random alea = new Random();

        String placa;
        String marca;
        String modelo;
        String tipo;
        Color color;
        Date año = new Date(0);

        String combustible;
        int puertas;
        String transmision;
        int asientos;

        System.out.println("Ingrese una placa (ingrese h primero): ");
        placa = leer.next();

        System.out.println("Ingrese marca: ");
        marca = leer.nextLine();
        marca = leer.nextLine();

        System.out.println("Ingrese modelo: ");
        modelo = leer.nextLine();

        System.out.println("Ingrese el tipo de automovil que es: ");
        tipo = leer.next();

        System.out.println("Ingrese tipo de combustible: ");
        combustible = leer.next();

        color = JColorChooser.showDialog(null, "Elija el color del auto", Color.BLUE);
        System.out.println(color);

        System.out.println("Ingrese el anio de creacion: ");
        String year = leer.next();
        DateFormat df = new SimpleDateFormat("yyyy");
        año = df.parse(year);

        System.out.println("Ingrese cantidad de puertas: ");
        puertas = leer.nextInt();

        System.out.println("Ingrese tipo de transmision: ");
        transmision = leer.next();

        System.out.println("Ingrese numero de asientos: ");
        asientos = leer.nextInt();

        vehiculos.add(new Automovil(placa, marca, modelo, tipo, color, año, combustible, puertas, transmision, asientos));
        System.out.println("Automovil ingresado correctamente");
    }

    public static void AgregarMotocicleta() throws ParseException {
        Random alea = new Random();

        String placa;
        String marca;
        String modelo;
        String tipo;
        Color color;
        Date año = new Date(0);

        double velocidad;
        double peso;
        double consumo;

        System.out.println("Ingrese una placa (ingrese h primero): ");
        placa = leer.next();

        System.out.println("Ingrese marca: ");
        marca = leer.nextLine();
        marca = leer.nextLine();

        System.out.println("Ingrese modelo: ");
        modelo = leer.nextLine();

        System.out.println("Ingrese el tipo de motocicleta que es: ");
        tipo = leer.next();

        color = JColorChooser.showDialog(null, "Elija el color de la motocicleta", Color.BLUE);
        System.out.println(color);

        System.out.println("Ingrese el anio de creacion: ");
        String year = leer.next();
        DateFormat df = new SimpleDateFormat("yyyy");
        año = df.parse(year);

        System.out.println("Ingrese la velocidad de la motocicleta: ");
        velocidad = leer.nextDouble();

        System.out.println("Ingrese el peso de la motocicleta: ");
        peso = leer.nextDouble();

        System.out.println("Ingrese la cantidad de consumo de combustible que consume: ");
        consumo = leer.nextDouble();

        vehiculos.add(new Motocicleta(tipo, year, tipo, tipo, color, año, peso, peso, consumo));
        System.out.println("Motocicleta ingresada correctamente");
    }

    public static void AgregarAutobus() throws ParseException {
        Random alea = new Random();

        String placa;
        String marca;
        String modelo;
        String tipo;
        Color color;
        Date año = new Date(0);

        int cantpasajero;
        int numejes;
        double longitud;

        System.out.println("Ingrese una placa (ingrese h primero): ");
        placa = leer.next();

        System.out.println("Ingrese marca: ");
        marca = leer.nextLine();
        marca = leer.nextLine();

        System.out.println("Ingrese modelo: ");
        modelo = leer.nextLine();

        System.out.println("Ingrese el tipo de bus que es: ");
        tipo = leer.next();

        color = JColorChooser.showDialog(null, "Elija el color del bus", Color.BLUE);
        System.out.println(color);

        System.out.println("Ingrese el anio de creacion: ");
        String year = leer.next();
        DateFormat df = new SimpleDateFormat("yyyy");
        año = df.parse(year);

        System.out.println("Ingrese la capacidad de pasajeros del bus: ");
        cantpasajero = leer.nextInt();

        System.out.println("Ingrese el numero de ejes : ");
        numejes = leer.nextInt();

        System.out.println("Ingrese la longitud del bus: ");
        longitud = leer.nextDouble();

        vehiculos.add(new Autobus(placa, marca, modelo, tipo, color, año, cantpasajero, numejes, longitud));
        System.out.println("Bus ingresado correctamente");
    }
    
    public static void modificarVehiculo(){
        
    }
     static void mostrarVehiculo(){
        if (vehiculos.isEmpty()) {
            System.out.println("No hay nada aun");
        } else {
            for (Object vehiculo : vehiculos) {
                if (vehiculo instanceof Automovil||vehiculo instanceof Motocicleta||vehiculo instanceof Autobus) {
                        Object object = (Object) vehiculo;
                        System.out.println(vehiculos.indexOf(vehiculo)+"-"+vehiculo+"\n");
                    }
            }
        }
    }
}
