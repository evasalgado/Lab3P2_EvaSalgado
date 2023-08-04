/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_evasalgado;

import java.awt.Color;

/**
 *
 * @author evaja
 */
public class Autobus {
    protected int placa; 
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color; 
    private int cantpasajero;
    private int numejes;
    private double longitud;
    
    public Autobus(){
        
    }

    public Autobus(int placa, String marca, String modelo, String tipo, Color color, int cantpasajero, int numejes, double longitud) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.cantpasajero = cantpasajero;
        this.numejes = numejes;
        this.longitud = longitud;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int p) {
        this.placa = p;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String mar) {
        this.marca = mar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color col) {
        this.color = col;
    }

    public int getCantpasajero() {
        return cantpasajero;
    }

    public void setCantpasajero(int c) {
        this.cantpasajero = c;
    }

    public int getNumejes() {
        return numejes;
    }

    public void setNumejes(int n) {
        this.numejes = n;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double l) {
        this.longitud = l;
    }

    @Override
    public String toString() {
        return "Autobus{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", cantpasajero=" + cantpasajero + ", numejes=" + numejes + ", longitud=" + longitud + '}';
    }
    
    
}
