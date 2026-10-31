package Ejercicio5_UnidadesCombate;

public abstract class UnidadCombate {
    private int posicionX;
    private int posicionY;
    private int energia;

    protected UnidadCombate(int posicionX, int posicionY, int energia) {
        if (energia < 0) {
            throw new IllegalArgumentException("La energía no puede ser negativa");
        }
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.energia = energia;
    }

    public abstract boolean moverse(int nuevaX, int nuevaY);

    public abstract String atacar();

    protected int distanciaA(int x, int y) {
        return Math.abs(x - posicionX) + Math.abs(y - posicionY);
    }

    protected void ubicarEn(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    protected boolean gastarEnergia(int cantidad) {
        if (cantidad > energia) {
            return false;
        }
        energia -= cantidad;
        return true;
    }

    public int getPosicionX() { return posicionX; }
    public int getPosicionY() { return posicionY; }
    public int getEnergia() { return energia; }

    @Override
    public String toString() {
        return String.format("%s en (%d,%d) con energía %d", getClass().getSimpleName(), posicionX, posicionY, energia);
    }
}
