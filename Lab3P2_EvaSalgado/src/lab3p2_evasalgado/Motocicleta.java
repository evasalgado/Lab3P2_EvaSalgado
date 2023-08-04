/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_evasalgado;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author evaja
 */
public class Motocicleta {
    protected String placa; 
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    protected Date año;
    private double velocidad;
    private double peso;
    private double consumo;
    
    public Motocicleta(){
        
    }

  
    
    public Motocicleta(String p, String m, String mo, String t , Color c, Date a, double v, double peso, double cons) {
        this.placa = p;
        this.marca = m;
        this.modelo = mo;
        this.tipo = t;
        this.color = c;
        this.año = a;

        this.velocidad = v;
        this.peso = peso;
        this.consumo = cons;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String pl) {
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
     public Date getAño() {
        return año;
    }

    public void setAño(Date a) {
        this.año = a;
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
        return "placa: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\ntipo: " + tipo + "\ncolor:" + color + "\nanio:"+año +"\nvelocidad: " + velocidad+"km/h" + "\npeso: " + peso +"kg"+ "\nconsumo: " + consumo;
    }
    
    
}
