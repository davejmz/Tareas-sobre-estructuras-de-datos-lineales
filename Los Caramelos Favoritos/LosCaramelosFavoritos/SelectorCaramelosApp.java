package LosCaramelosFavoritos;

public class SelectorCaramelosApp {
    public static void main(String[] args) {
        SelectorCaramelos paquete = new SelectorCaramelos();
        paquete.agregarCaramelo("rojo");
        paquete.agregarCaramelo("amarillo");
        paquete.agregarCaramelo("verde");
        paquete.agregarCaramelo("amarillo");
        paquete.agregarCaramelo("azul");

        System.out.println("Paquete original: " + paquete);
        paquete.comerAmarillos();
        System.out.println("Paquete después de comer amarillos: " + paquete);
    }
}