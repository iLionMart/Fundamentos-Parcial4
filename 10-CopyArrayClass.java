import java.util.Arrays;

public class arreglocopy {
    public static void main(String[] args) {

        int array[] = {2, 2, 1, 8, 3, 2, 2, 4, 2, 5};
        int[] copiarray = Arrays.copyOf(array, 10);

        System.out.println("Array original :" + Arrays.toString(array));
        System.out.println("Array copiado :" + Arrays.toString(copiarray));
    }
}
