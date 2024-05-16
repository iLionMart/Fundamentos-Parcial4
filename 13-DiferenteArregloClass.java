import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String tecladolim = JOptionPane.showInputDialog("Introduce la cantidad de numeros a entregar");
        int limitearray = Integer.valueOf(tecladolim);

        int[] numaleatorios = new int[limitearray];

        for(int i=1; i < limitearray; i++) {
            numaleatorios[i] = (int) (Math.random() * (30 - 1) + 1) + i;
            System.out.print(numaleatorios[i] + " ");
        }
    }
}
