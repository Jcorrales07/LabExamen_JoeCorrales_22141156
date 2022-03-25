package labexamenjoecorrales;

import java.io.Serializable;
import java.util.Random;

public abstract class Planeta implements Serializable {
    protected Random rd = new Random();
    protected String nombre;
    protected double tamannio;
    protected double peso;
    protected double coorX;
    protected double coorY;

    public Planeta() {}
    
    public Planeta(double tamannio, double peso, String nombre, double coorX, double coorY) {
        this.tamannio = tamannio;
        this.peso = peso;
        this.nombre = nombre;
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
