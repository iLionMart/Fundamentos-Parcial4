import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        char[] id = new char[27];
        int validador = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i=0; i<27; i++){
            id[i] = (char) ('A' + i);
        }

        System.out.println("Introuduce un numero para reemplazarlo por una letra");

        while (validador == 0) {
            int idn = teclado.nextInt();

            if (idn < 27 && idn > 0) {
                System.out.println("La letra del numero: " + idn + " es: ");
                System.out.println(id[idn - 1]);
            } else if (idn == -1) {
                System.out.println("Fin del programa");
                validador = 1;
            } else {
                System.out.println("Error, introduce un valor correcto");
            }
        }
    }
}
