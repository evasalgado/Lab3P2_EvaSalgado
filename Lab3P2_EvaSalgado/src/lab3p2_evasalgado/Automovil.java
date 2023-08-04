/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_evasalgado;

import java.awt.Color;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Automovil {
    Scanner leer = new Scanner(System.in);
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    protected Date año;
    protected double costo;
    private String combustible;
    private int puertas;
    private String transmision;
    private int asientos;

    public Automovil() {
    }

    public Automovil(double c) {
        this.costo = c;
    }
    
   
    public Automovil(String p, String m, String mod, String t, Color c, Date a, String comb, int puer, String tran, int as, double cos) {
        this.placa = p;
        this.marca = m;
        this.modelo = mod;
        this.tipo = t;
        this.color = c;
        this.año=año;
        this.costo=cos;
        this.combustible = comb;
        this.puertas = puer;
        this.transmision = tran;
        this.asientos = as;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String p) {
        this.placa=p;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String ma) {
        this.marca = ma;
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

    public void setColor(Color co) {
        this.color = co;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date a) {
        this.año = a;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double c) {
        this.costo = c;
    }
    
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String c) {
        this.combustible = c;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int p) {
        this.puertas = p;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String t) {
        this.transmision = t;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int a) {
        this.asientos = a;
    }

    @Override
    public String toString() {
        return "placa: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\ntipo: " + tipo + "\ncolor:" + color + "\nanio:"+año + "\ncombustible: " + combustible + "\npuertas=" + puertas + "\ntransmision:" + transmision + "\nasientos:" + asientos ;
    }
    
}
