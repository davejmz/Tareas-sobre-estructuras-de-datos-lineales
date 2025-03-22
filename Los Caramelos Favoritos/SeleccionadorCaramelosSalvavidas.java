import java.util.Stack;

public class SeleccionadorCaramelosSalvavidas {

    public static void seleccionarYComerCaramelos(Stack<String> paquete) {
        if (paquete == null) {
            return;
        }

        Stack<String> pilaAuxiliar = new Stack<>();

        while (!paquete.isEmpty()) {
            String caramelo = paquete.pop();
            if (caramelo.equals("amarillo")) {
                System.out.println("Que delicioso caramelo amarillo!");
            } else {
                pilaAuxiliar.push(caramelo);
            }
        }

        while (!pilaAuxiliar.isEmpty()) {
            paquete.push(pilaAuxiliar.pop());
        }
   
    }

    public static void main(String[] args) {
        Stack<String> paqueteCaramelos = new Stack<>();
        paqueteCaramelos.push("rojo");
        paqueteCaramelos.push("amarillo");
        paqueteCaramelos.push("verde");
        paqueteCaramelos.push("amarillo");
        paqueteCaramelos.push("azul");
        paqueteCaramelos.push("amarillo");

        System.out.println("Paquete original: " + paqueteCaramelos);
        seleccionarYComerCaramelos(paqueteCaramelos);
        System.out.println("Paquete despues de comer los amarillos: " + paqueteCaramelos);
    }
}