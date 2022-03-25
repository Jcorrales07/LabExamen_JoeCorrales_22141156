package labexamenjoecorrales;

public class Gaseoso extends Planeta {
    public Gaseoso() {}

    public Gaseoso(double tamannio, double peso, String nombre, double coorX, double coorY) {
        super(tamannio, peso, nombre, coorX, coorY);
    }

    @Override
    public int probabilidad() {
        return (rd.nextInt(25));
    }
}
