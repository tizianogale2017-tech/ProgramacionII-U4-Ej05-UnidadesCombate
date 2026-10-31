package Ejercicio5_UnidadesCombate;

import java.util.List;

public class ComandoGeneral {
    public void ordenarMovimiento(List<UnidadCombate> unidades, int destinoX, int destinoY) {
        for (UnidadCombate u : unidades) {
            boolean movio = u.moverse(destinoX, destinoY);
            System.out.println((movio ? "OK     " : "NO PUDO") + " -> " + u);
        }
    }

    public void ordenarAtaque(List<UnidadCombate> unidades) {
        for (UnidadCombate u : unidades) {
            System.out.println(u.atacar());
        }
    }
}
