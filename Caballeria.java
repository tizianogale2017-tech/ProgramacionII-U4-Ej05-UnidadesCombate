package Ejercicio5_UnidadesCombate;

public class Caballeria extends UnidadCombate {
    private static final int ALCANCE_MAXIMO = 8;
    private static final int COSTO_POR_CASILLA = 3;

    public Caballeria(int x, int y, int energia) {
        super(x, y, energia);
    }

    @Override
    public boolean moverse(int nuevaX, int nuevaY) {
        int distancia = distanciaA(nuevaX, nuevaY);
        if (distancia > ALCANCE_MAXIMO || !gastarEnergia(distancia * COSTO_POR_CASILLA)) {
            return false;
        }
        ubicarEn(nuevaX, nuevaY);
        return true;
    }

    @Override
    public String atacar() {
        return "Caballería: carga con sable (daño 30)";
    }
}
