package InvertirOrdenDeSecuenciaDeElementos;


public class InversorApp {
    public static void main(String[] args) {
        Inversor<Integer> inversorNumeros = new Inversor<>();
        inversorNumeros.agregarElemento(1);
        inversorNumeros.agregarElemento(2);
        inversorNumeros.agregarElemento(3);
        inversorNumeros.agregarElemento(4);
        inversorNumeros.agregarElemento(5);
        System.out.println("Original: " + inversorNumeros);
        inversorNumeros.invertir();
        System.out.println("Invertido: " + inversorNumeros);

        Inversor<String> inversorPalabras = new Inversor<>();
        inversorPalabras.agregarElemento("Uno");
        inversorPalabras.agregarElemento("Dos");
        inversorPalabras.agregarElemento("Tres");
        System.out.println("Original: " + inversorPalabras);
        inversorPalabras.invertir();
        System.out.println("Invertido: " + inversorPalabras);
    }
}