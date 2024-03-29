package labexamenjoecorrales;

import java.io.Serializable;
import java.util.ArrayList;

public class Cientifico implements Serializable {
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
        return  nombre;
    }
}
