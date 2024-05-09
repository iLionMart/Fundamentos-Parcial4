public class main {
    public static void main(String[] args) {

        Double[] array = new Double[9];

        for (int i=1; i<9; i++){
            array[i] = (Math.floor(Math.random() * (999 - 0)) + 0);
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " par ");
            }else{
                System.out.print(array[i] + " impar ");
            }
        }
    }
}
