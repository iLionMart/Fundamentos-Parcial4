public class main {
    public static void main(String[] args) {

        int[] array1 = new int[6];
        int[] array2 = new int[6];

        System.out.print("Array 1: ");
        System.out.println();

        for(int i = 1; i < 6; i++){
            array1[i] = i;
            array2[i] = i;
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        System.out.println();

        for(int i = 5; i > 0; i--){
            System.out.print(array2[i] + " ");
        }
    }
}
