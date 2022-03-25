/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamenjoecorrales;

/**
 *
 * @author Corra
 */
public class Terrestre extends Planeta {
    public Terrestre() {}

    public Terrestre(double tamannio, double peso, String nombre, double coorX, double coorY) {
        super(tamannio, peso, nombre, coorX, coorY);
    }
    
    @Override
    public int probabilidad() {
        return (rd.nextInt(25));
    }
}
