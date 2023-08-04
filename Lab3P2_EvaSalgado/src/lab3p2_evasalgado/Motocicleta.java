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
public class Motocicleta {
    protected int placa; 
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    private double velocidad;
    private double peso;
    private double consumo;
    
    public Motocicleta(){
        
    }

    public Motocicleta(int placa, String marca, String modelo, String tipo, Color color, double velocidad, double peso, double consumo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.velocidad = velocidad;
        this.peso = peso;
        this.consumo = consumo;
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

    public void setColor(Color col) {
        this.color = col;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double v) {
        this.velocidad = v;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double c) {
        this.consumo = c;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", velocidad=" + velocidad + ", peso=" + peso + ", consumo=" + consumo + '}';
    }
    
    
}
