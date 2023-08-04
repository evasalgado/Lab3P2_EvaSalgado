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
                    modificarVehiculo();
                    break;
                case 5:
                    eliminarVehiculo();
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
        String[] h = placa.split("");
        if (h[7].endsWith("")) {
            if (!h[0].equals("B")) {
               while (!h[0].equals("B")) {
                    System.out.println("Placa no valida");
                    System.out.println("Ingrese una placa (ingrese h primero): ");
                    placa = leer.next();
                }
            } 
        } else {
            System.out.println("Limite de caracter excedido");
            while (!h[7].equals("")) {
                System.out.println("Placa no valida");
                System.out.println("Ingrese una placa (ingrese h primero): ");
                placa = leer.next();

            }
        }
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
        String a[] = year.split("");
        if (a[4].endsWith("")) {
            DateFormat df = new SimpleDateFormat("yyyy");
            año = df.parse(year);
        } else {
            while (!a[4].endsWith("")) {
                System.out.println("Fecha ingresada no es valida");
                System.out.println("Ingrese el anio de creacion: ");
                year = leer.next();

            }
        }
        System.out.println("Ingrese cantidad de puertas: ");
        puertas = leer.nextInt();
        if (puertas > 4) {
            while (puertas > 4) {
                System.out.println("Numero de puertas excedida");
                System.out.println("Ingrese cantidad de puertas: ");
                puertas = leer.nextInt();
            }
        }
        System.out.println("Ingrese tipo de transmision: ");
        transmision = leer.nextLine();

        System.out.println("Ingrese numero de asientos: ");
        asientos = leer.nextInt();
        if (asientos>6) {
            while (asientos>6) {                
                System.out.println("Exceso de asientos encontrado: ");
                System.out.println("Ingrese numero de asientos: ");
                asientos = leer.nextInt();
            }
        }
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
        String[] b = placa.split("");
        if (b[7].endsWith("")) {
            if (!b[0].equals("B")) {
                while (!b[0].equals("B")) {
                    System.out.println("Placa no valida");
                    System.out.println("Ingrese una placa (ingrese h primero): ");
                    placa = leer.next();
                }
            }
        } else {
            System.out.println("Limite de caracter excedido");
            while (!b[7].equals("")) {
                System.out.println("Placa no valida");
                System.out.println("Ingrese una placa (ingrese h primero): ");
                placa = leer.next();
            }
        }

        System.out.println("Ingrese modelo: ");
        modelo = leer.nextLine();

        System.out.println("Ingrese el tipo de motocicleta que es: ");
        tipo = leer.next();

        color = JColorChooser.showDialog(null, "Elija el color de la motocicleta", Color.BLUE);
        System.out.println(color);

        System.out.println("Ingrese el anio de creacion: ");
        String year = leer.next();
        String[] a = year.split("");
        if (a[4].endsWith("")) {
            DateFormat df = new SimpleDateFormat("yyyy");
            año = df.parse(year);
        } else {
            while (!a[4].endsWith("")) {
                System.out.println("Fecha ingresada no es valida");
                System.out.println("Ingrese el anio de creacion: ");
                year = leer.next();

            }
        }

        System.out.println("Ingrese la velocidad maxima de la motocicleta: ");
        velocidad = leer.nextDouble();
        if (velocidad > 120) {
            while (velocidad > 120) {
                System.out.println("Velocidad  Invalida");
                System.out.println("Ingrese la velocidad maxima de la motocicleta: ");
                velocidad = leer.nextDouble();
            }
        } else if (velocidad < 60) {
            while (velocidad < 60 || velocidad > 120) {
                System.out.println("Velocidad  Invalida");
                System.out.println("Ingrese la velocidad maxima de la motocicleta: ");
                velocidad = leer.nextDouble();
            }

        }

        System.out.println("Ingrese el peso de la motocicleta: ");
        peso = leer.nextDouble();

        System.out.println("Ingrese la cantidad de consumo de combustible que consume: ");
        consumo = leer.nextDouble();
        if (consumo>100) {
            while (consumo>100) {                
                System.out.println("Limite de consumo excedido");
                System.out.println("Ingrese la cantidad de consumo de combustible que consume: ");
                consumo = leer.nextDouble();
            }
        } 
        vehiculos.add(new Motocicleta(placa, marca, modelo, tipo, color, año, velocidad, peso, consumo));
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
        String[] h = placa.split("");
        if (h[7].endsWith("")) {
            if (!h[0].equals("B")) {
                while (!h[0].equals("B")) {
                    System.out.println("Placa no valida");
                    System.out.println("Ingrese una placa (ingrese h primero): ");
                    placa = leer.next();
                }

            } 
        } else {
            System.out.println("Limite de caracter excedido");
            while (!h[7].equals("")) {
                System.out.println("Placa no valida");
                System.out.println("Ingrese una placa (ingrese h primero): ");
                placa = leer.next();

            }
        }

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
        String[] a = year.split("");
        if (a[4].endsWith("")) {
            DateFormat df = new SimpleDateFormat("yyyy");
            año = df.parse(year);
        } else {
            while (!a[4].endsWith("")) {
                System.out.println("Fecha ingresada no es valida");
                System.out.println("Ingrese el anio de creacion: ");
                year = leer.next();

            }
        }

        System.out.println("Ingrese la capacidad de pasajeros del bus: ");
        cantpasajero = leer.nextInt();

        System.out.println("Ingrese el numero de ejes : ");
        numejes = leer.nextInt();

        System.out.println("Ingrese la longitud del bus: ");
        longitud = leer.nextDouble();

        vehiculos.add(new Autobus(placa, marca, modelo, tipo, color, año, cantpasajero, numejes, longitud));
        System.out.println("Bus ingresado correctamente");
    }

    public static void modificarVehiculo() throws ParseException {
        if (vehiculos.isEmpty()) {
            System.out.println("Aqui no hay nada");
        } else {
            String placa;
            String marca;
            String modelo;
            String tipo;
            Color color;
            Date año = new Date(0);
            mostrarVehiculo();
            System.out.println("");
            System.out.println("Ingrese el indice del elemento que desea eliminar: ");
            int i = leer.nextInt();

            if (i >= 0 && i < vehiculos.size()) {
                System.out.println("Ingrese lo que desea editar: \n"
                        + "a. Placa\n"
                        + "b. marca\n"
                        + "c. modelo\n"
                        + "d. tipo\n"
                        + "e. color\n"
                        + "f. anio");
                char opcion = leer.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        System.out.println("Ingrese una placa (ingrese h primero): ");
                        placa = leer.next();
                        ((Automovil) vehiculos.get(i)).setPlaca(placa);
                        break;
                    case 'b':
                        System.out.println("Ingrese marca: ");
                        marca = leer.nextLine();
                        marca = leer.nextLine();
                        ((Automovil) vehiculos.get(i)).setMarca(marca);
                        break;
                    case 'c':
                        System.out.println("Ingrese modelo: ");
                        modelo = leer.nextLine();
                        ((Automovil) vehiculos.get(i)).setModelo(modelo);
                        break;
                    case 'd':
                        System.out.println("Ingrese el tipo de automovil que es: ");
                        tipo = leer.next();
                        ((Automovil) vehiculos.get(i)).setTipo(tipo);
                        break;
                    case 'e':
                        color = JColorChooser.showDialog(null, "Elija el color del auto", Color.BLUE);
                        System.out.println(color);
                        ((Automovil) vehiculos.get(i)).setColor(color);
                        break;
                    case 'f':
                        System.out.println("Ingrese el anio de creacion: ");
                        String year = leer.next();
                        DateFormat df = new SimpleDateFormat("yyyy");
                        año = df.parse(year);
                        ((Automovil) vehiculos.get(i)).setAño(año);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } else {
                System.out.println("Indice fuera de rango");
            }
        }

    }

    public static void eliminarVehiculo() {
        if (vehiculos.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            mostrarVehiculo();
            System.out.println("Ingrese el indice del elemento que desea eliminar: ");
            int i = leer.nextInt();
            if (i >= 0 && i < vehiculos.size()) {
                if (vehiculos.get(i) instanceof Automovil || vehiculos.get(i) instanceof Motocicleta
                        || vehiculos.get(i) instanceof Autobus) {
                    System.out.println("Seguro quieres eliminar este elemento[s/n]: "); //S es si, n es no
                    char resp = leer.next().charAt(0);
                    if (resp == 's') {
                        vehiculos.remove(i);
                        System.out.println("Vehiculo eliminado exitosamente");
                    } else {
                        System.out.println("No se eliminó el vehiculo");
                    }
                } else {
                    System.out.println("Vehiculo no encontrado");
                }
            } else {
                System.out.println("Indice fuera de rango");
            }
        }
    }

    static void mostrarVehiculo() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay nada aun");
        } else {
            for (Object vehiculo : vehiculos) {
                if (vehiculo instanceof Automovil || vehiculo instanceof Motocicleta || vehiculo instanceof Autobus) {
                    System.out.println(vehiculos.indexOf(vehiculo) + "-" + vehiculo + "\n");
                }
            }
        }
    }
}
