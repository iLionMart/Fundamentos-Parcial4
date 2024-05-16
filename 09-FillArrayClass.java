import java.util.Arrays;

public class arreglofill {
    public static void main(String[] args) {

        int array[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
        Arrays.fill(array, 10);
        System.out.println("El array se lleno" + " con 10\n" + Arrays.toString(array));
    }
}
