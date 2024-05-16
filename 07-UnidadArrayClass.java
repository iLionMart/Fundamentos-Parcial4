import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String tecladolim = JOptionPane.showInputDialog("Introduce la cantidad de numeros a entregar");
        int limitearray = Integer.valueOf(tecladolim);

        int[] numaleatorios = new int[limitearray];
        int[] unidadnum = new int[limitearray];

        String tecladolim2 = JOptionPane.showInputDialog("Introduzca la unidad que tiene que usar");
        int unidadarray = Integer.valueOf(tecladolim2);

        System.out.print("Los numeros con limite " + unidadarray + " son: ");
        System.out.println();
        for(int i=1; i < limitearray; i++){
            unidadnum[i] = unidadarray;
        }

        for(int i=1; i < limitearray; i++){
            numaleatorios[i] = (int) (Math.random() * (30 - 1) + 1);
            numaleatorios[i] *= 10;
            numaleatorios[i] += unidadnum[i];

            System.out.print(numaleatorios[i] + " ");
        }
    }
}
