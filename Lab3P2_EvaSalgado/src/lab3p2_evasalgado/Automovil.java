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
public class Automovil {

    protected String placa;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    protected Date año;
    private String combustible;
    private int puertas;
    private String transmision;
    private int asientos;

    public Automovil() {
    }

   
    public Automovil(String placa, String marca, String modelo, String tipo, Color color, Date año, String combustible, int puertas, String transmision, int asientos) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.año=año;
        this.combustible = combustible;
        this.puertas = puertas;
        this.transmision = transmision;
        this.asientos = asientos;
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

    public void setColor(Color co) {
        this.color = co;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date a) {
        this.año = a;
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
