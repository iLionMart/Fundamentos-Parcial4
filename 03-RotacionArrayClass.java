public class main {
    public static void main(String[] args) {

        Double[] array = new Double[17];
        Double[] arrayr = new Double[17];

        System.out.println("Array Original: ");
        for (int i=1; i<16; i++) {
            array[i] = (Math.floor(Math.random() * (100 - 0)) + 0);
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.println("Array Rotado: ");
        for (int i=1; i<16; i++) {
            arrayr[i] = array[i+1];
            if(i==15){
                arrayr[i] = array[1];
            }
            System.out.print(arrayr[i] + " ");
        }
    }
}
