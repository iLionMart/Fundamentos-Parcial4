import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String lector = JOptionPane.showInputDialog("Introduzca una frase");
        String texto = null;
        char[] letras;

        int mayorRepeticion = 0;
        char letraMasRepetida = 0;

        System.out.println("Escribe una frase: ");

        texto = lector;
        letras = texto.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            char letraActual = letras[i];
            int contador = 0;

            for (int j = 0; j < letras.length; j++) {
                if (letras[j] == letraActual)
                    contador++;
            }

            if (mayorRepeticion < contador) {
                mayorRepeticion = contador;
                letraMasRepetida = letraActual;
            }
        }

        System.out.println("La " + letraMasRepetida + ": Se repite " + mayorRepeticion);
    }
}
