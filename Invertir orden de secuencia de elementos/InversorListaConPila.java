import java.util.Stack;

public class InversorListaConPila {

    public static <T> void invertirLista(T[] arreglo) {
        if (arreglo == null) {
            return; 
        }

        Stack<T> pila = new Stack<>();

        for (T elemento : arreglo) {
            pila.push(elemento);
        }

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = pila.pop();
        }
    }


    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + java.util.Arrays.toString(numeros));
        invertirLista(numeros);
        System.out.println("Arreglo invertido: " + java.util.Arrays.toString(numeros));

        String[] palabras = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};
        System.out.println("Arreglo original: " + java.util.Arrays.toString(palabras));
        invertirLista(palabras);
        System.out.println("Arreglo invertido: " + java.util.Arrays.toString(palabras));
    }
}