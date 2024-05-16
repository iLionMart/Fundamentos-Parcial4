import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int array[] = {2, 2, 1, 8, 3, 2, 2, 4, 2, 5};
        System.out.println("Array 1 :" + Arrays.toString(array));
        int[] array2 = Arrays.copyOf(array, 10);
        System.out.println("Array 2 :" + Arrays.toString(array2));
        int array3[] = {1, 1, 2, 4, 1, 1, 1, 2, 1, 2};
        System.out.println("Array 3 :" + Arrays.toString(array3));

        System.out.println("¿El array 1 es igual al 2? " +  Arrays.equals(array, array2));
        System.out.println("¿El array 1 es igual al 3? " +  Arrays.equals(array, array3));
    }
}
