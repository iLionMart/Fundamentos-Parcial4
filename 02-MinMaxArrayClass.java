import javax.swing.*;
public class main {
    public static void main(String[] args) {

        int[] array = new int[11];
        int min = 0;
        int max = 0;

        for (int i=1; i<11; i++){
            String num = JOptionPane.showInputDialog("Introduzca un número");
            array[i] = Integer.valueOf(num);

            System.out.print(array[i] + " ");

            if (min == 0){
                min = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("");
        System.out.println("El numero mas alto fue: " + max);
        System.out.println("El numero mas bajo fue: " + min);
    }
}
