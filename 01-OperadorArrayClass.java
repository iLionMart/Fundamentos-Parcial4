public class main {
    public static void main(String[] args) {

        Double[] array = new Double[21];
        Double[] array2 = new Double[21];
        Double[] array3 = new Double[21];

        System.out.print("Array 1");
        System.out.println("");

        for (int i=1; i<21; i++){
            array[i] = (Math.floor(Math.random() * (100 - 0)) + 0);
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.print("Array 2");
        System.out.println("");

        for (int i=1; i<21; i++){
            array2[i] = (Math.pow(array[i], 2));
            System.out.print(array2[i] + " ");
        }

        System.out.println("");
        System.out.print("Array 3");
        System.out.println("");

        for (int i=1; i<21; i++){
            array3[i] = (Math.pow(array[i], 3));
            System.out.print(array3[i] + " ");
        }
    }
}
