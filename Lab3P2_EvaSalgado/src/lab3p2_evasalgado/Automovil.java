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
public class Automovil {

    protected int placa;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    private String combustible;
    private int puertas;
    private String transmision;
    private int asientos;

    public Automovil() {
    }

   
    public Automovil(int placa, String marca, String modelo, String tipo, Color color, String combustible, int puertas, String transmision, int asientos) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.combustible = combustible;
        this.puertas = puertas;
        this.transmision = transmision;
        this.asientos = asientos;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int pl) {
       this.placa = pl;
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
        return "Automovil{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", combustible=" + combustible + ", puertas=" + puertas + ", transmision=" + transmision + ", asientos=" + asientos + '}';
    }
    
}
