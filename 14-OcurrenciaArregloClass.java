public class main {
    public static void main(String[] args) {

        int[] numero = {10, 11, 12, 13, 14, 15, 16, 17, 10, 14, 15};
        int[] repetidos = new int[12];
        int max = 0, min = 500, suma = 0, existencia = 0, j = 0;

        System.out.print("Cadena: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        // Suma //
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        System.out.println();
        System.out.print("Suma de los numeros: ");
        System.out.print(suma);
        System.out.println();
        System.out.print("Promedio de los numeros: ");
        System.out.print(suma / 11);
        System.out.println();


        // Maximos y minimos //
        for (int i = 0; i < numero.length; i++) {
            if (min == 500) {
                min = numero[i];
            }
            if (numero[i] < min) {
                min = numero[i];
            }
            if (numero[i] > max) {
                max = numero[i];
            }

            if (numero[i] == 0) {
                min = numero[i];
            }
        }
        System.out.print("Mayor de los numeros: ");
        System.out.print(max);
        System.out.println();
        System.out.print("Menor de los numeros: ");
        System.out.print(min);
        System.out.println();

        // Repetidos //
        for (int i = 0; i < numero.length; i++) {
            j = 0;
            while ( j < numero.length){
                if(numero[i] == numero[j]){
                    if(i == j){
                    }else{
                        repetidos[i] = numero[i];
                    }
                }
                j += 1;
            }
        }

            System.out.print("Repetidos: ");
            for (int i1 = 0; i1 < numero.length; i1++) {
                if (repetidos[i1] == 0){
                }else {
                    System.out.print(repetidos[i1] + " ");
                }
            }
            System.out.println();

            System.out.print("Invertido: ");
            // Invertido //
            for (int i2 = 10; i2 > -1; i2--) {
                System.out.print(numero[i2] + " ");
            }
    }
}
