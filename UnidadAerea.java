package Ejercicio5_UnidadesCombate;

public class UnidadAerea extends UnidadCombate {
    private static final int COSTO_POR_CASILLA = 5;

    public UnidadAerea(int x, int y, int energia) {
        super(x, y, energia);
    }

    @Override
    public boolean moverse(int nuevaX, int nuevaY) {
        // Vuela: ignora el terreno, no tiene alcance máximo, pero gasta mucha energía.
        if (!gastarEnergia(distanciaA(nuevaX, nuevaY) * COSTO_POR_CASILLA)) {
            return false;
        }
        ubicarEn(nuevaX, nuevaY);
        return true;
    }

    @Override
    public String atacar() {
        return "Unidad aérea: bombardeo en picada (daño 45)";
    }
}
