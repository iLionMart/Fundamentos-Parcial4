import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Introduzca un texto y se detectara si es palindromo o no");
        StringBuffer texto2 = new StringBuffer(texto);
        texto2.reverse();
        String texto3 = texto2.toString();

        System.out.print("Texto 1: ");
        System.out.println(texto);
        System.out.print("Texto 2: ");
        System.out.println(texto2);

        if (texto.equals(texto3)){
            System.out.println("En efecto es palíndromo :D");
        }else{
            System.out.println("No es palíndromo :(");
        }
    }
}
