import java.util.Deque;
import java.util.LinkedList;

class ColaDoble<T> {
    private final Deque<T> cola = new LinkedList<>();

    public void encolarAlFrente(T elemento) {
        cola.addFirst(elemento);
        System.out.println(elemento + " añadido al frente.");
    }

    public void encolarAlFinal(T elemento) {
        cola.addLast(elemento);
        System.out.println(elemento + " añadido al final.");
    }

    public T desencolarDelFrente() {
        if (!cola.isEmpty()) {
            T elemento = cola.removeFirst();
            System.out.println("Removido del frente: " + elemento);
            return elemento;
        } else {
            System.out.println("La cola doble está vacía, no se puede remover del frente.");
            return null;
        }
    }

    public T desencolarDelFinal() {
        if (!cola.isEmpty()) {
            T elemento = cola.removeLast();
            System.out.println("Removido del final: " + elemento);
            return elemento;
        } else {
            System.out.println("La cola doble está vacía, no se puede remover del final.");
            return null;
        }
    }

    public void mostrarFrente() {
        if (!cola.isEmpty()) {
            System.out.println("Frente de la cola doble: " + cola.peekFirst());
        } else {
            System.out.println("La cola doble está vacía.");
        }
    }

    public void mostrarFinal() {
        if (!cola.isEmpty()) {
            System.out.println("Final de la cola doble: " + cola.peekLast());
        } else {
            System.out.println("La cola doble está vacía.");
        }
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}