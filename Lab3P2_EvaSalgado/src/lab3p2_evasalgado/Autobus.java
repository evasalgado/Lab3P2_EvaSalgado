/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_evasalgado;

import java.awt.Color;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author evaja
 */
public class Autobus {
    protected String placa; 
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color; 
    protected Date año;
    private int cantpasajero;
    private int numejes;
    private double longitud;
    
    public Autobus(){
        
    }

    public Autobus(String placa, String marca, String modelo, String tipo, Color color, Date a, int cantpasajero, int numejes, double longitud) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.año = a;
        this.cantpasajero = cantpasajero;
        this.numejes = numejes;
        this.longitud = longitud;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String p) {
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
     public Date getAño() {
        return año;
    }

    public void setAño(Date a) {
        this.año = a;
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
        return "placa: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\ntipo: " + tipo + "\ncolor:" + color + "\nanio:"+año  + ",\ncantpasajero: " + cantpasajero + "\nnumejes: " + numejes + "\nlongitud: " + longitud ;
    }
    
    
}
