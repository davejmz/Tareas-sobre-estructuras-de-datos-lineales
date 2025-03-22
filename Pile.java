import java.util.Stack;

class Pile<T> {
    private final Stack<T> elementos = new Stack<>();
    private final Stack<T> deshechos = new Stack<>();

    public void addLine(T elemento) {
        elementos.push(elemento);
        deshechos.clear();
    }

    public void undo() {
        if (!elementos.isEmpty()) {
            deshechos.push(elementos.pop());
        } else {
            System.out.println("Nada que deshacer.");
        }
    }

    public void redo() {
        if (!deshechos.isEmpty()) {
            elementos.push(deshechos.pop());
        } else {
            System.out.println("Nada que rehacer.");
        }
    }

    public void display() {
        if (elementos.isEmpty()) {
            System.out.println("El texto está vacío.");
        } else {
            System.out.println("Texto actual:");
            for (T elemento : elementos) {
                System.out.println(elemento);
            }
        }
    }
}