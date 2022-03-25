/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamenjoecorrales;

import java.util.ArrayList;

/**
 *
 * @author Corra
 */
public class Cientifico {
    protected String nombre;
    protected ArrayList<Planeta> planetas;
    
    public Cientifico() {}
    
    public Cientifico(String nombre) {
        this.nombre = nombre;
        this.planetas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return "Cientifico{" + "nombre=" + nombre + '}';
    }
}
