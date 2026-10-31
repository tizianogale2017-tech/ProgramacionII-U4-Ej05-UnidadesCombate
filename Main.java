package Ejercicio5_UnidadesCombate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UnidadCombate> unidades = new ArrayList<>();
        unidades.add(new Infanteria(0, 0, 40));
        unidades.add(new Caballeria(0, 0, 60));
        unidades.add(new UnidadAerea(0, 0, 100));

        ComandoGeneral comando = new ComandoGeneral();
        System.out.println("--- Orden: avanzar a (1,2) ---");
        comando.ordenarMovimiento(unidades, 1, 2);
        System.out.println("--- Orden: avanzar a (6,6) ---");
        comando.ordenarMovimiento(unidades, 6, 6);
        System.out.println("--- Orden: atacar ---");
        comando.ordenarAtaque(unidades);
    }
}
