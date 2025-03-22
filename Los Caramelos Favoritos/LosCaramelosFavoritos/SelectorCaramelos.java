package LosCaramelosFavoritos; // Cambiado

import java.util.Stack;

public class SelectorCaramelos {
    private final Stack<String> paquete = new Stack<>();

    public void agregarCaramelo(String color) {
        paquete.push(color);
    }

    public void comerAmarillos() {
        Stack<String> pilaAuxiliar = new Stack<>();

        while (!paquete.isEmpty()) {
            String caramelo = paquete.pop();
            if (caramelo.equals("amarillo")) {
                System.out.println("¡Qué rico caramelo amarillo!");
            } else {
                pilaAuxiliar.push(caramelo);
            }
        }

        while (!pilaAuxiliar.isEmpty()) {
            paquete.push(pilaAuxiliar.pop());
        }
    }

     public Stack<String> getPaquete() {

        Stack<String> copiaPaquete = new Stack<>();
        copiaPaquete.addAll(paquete);
        return copiaPaquete;
    }

    @Override
    public String toString() {
        return "Paquete de caramelos: " + paquete;
    }
}