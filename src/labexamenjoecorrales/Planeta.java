/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamenjoecorrales;

import java.io.Serializable;

/**
 *
 * @author Corra
 */
public abstract class Planeta implements Serializable {
    protected String nombre;
    protected double tamannio;
    protected double peso;
    protected double coorX;
    protected double coorY;

    public Planeta() {}
    
    public Planeta(String nombre, double tamannio, double peso, double coorX, double coorY) {
        this.nombre = nombre;
        this.tamannio = tamannio;
        this.peso = peso;
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamannio() {
        return tamannio;
    }

    public void setTamannio(double tamannio) {
        this.tamannio = tamannio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCoorX() {
        return coorX;
    }

    public void setCoorX(double coorX) {
        this.coorX = coorX;
    }

    public double getCoorY() {
        return coorY;
    }

    public void setCoorY(double coorY) {
        this.coorY = coorY;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", tamannio=" + tamannio + ", peso=" + peso + ", coorX=" + coorX + ", coorY=" + coorY + '}';
    }
    
    public abstract int probabilidad();
}
