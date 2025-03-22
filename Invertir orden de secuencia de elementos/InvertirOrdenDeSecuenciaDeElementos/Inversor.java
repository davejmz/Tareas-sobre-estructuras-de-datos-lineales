package InvertirOrdenDeSecuenciaDeElementos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inversor<T> {
    private final List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void invertir() {
        Stack<T> pilaAuxiliar = new Stack<>();

        for (T elemento : elementos) {
            pilaAuxiliar.push(elemento);
        }

        elementos.clear();

        while (!pilaAuxiliar.isEmpty()) {
            elementos.add(pilaAuxiliar.pop());
        }
    }

    public List<T> obtenerElementos() {
        return new ArrayList<>(elementos);
    }

    @Override
    public String toString() {
        return "Inversor{" +
                "elementos=" + elementos +
                '}';
    }
}