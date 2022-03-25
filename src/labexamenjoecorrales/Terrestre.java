package labexamenjoecorrales;

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
