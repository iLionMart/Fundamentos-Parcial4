public class main {
    public static void main(String[] args) {

        int[] numero = new int[101];
        int max = 0, min = 500, promedio = 0, suma = 0, existencia = 0, x = 2, j = 1;
        int[] primo = new int[101];
        int[] par = new int[101];

        for (int i = 1; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100);
            System.out.print(numero[i] + " ");
        }

        // Maximos y minimos //
        for (int i = 1; i < numero.length; i++) {
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

        // Primo //
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] % x == 0) {
            } else {
                while (numero[i] % x != 0) {
                    x = x + 1;
                    if (numero[i] == x) {
                        primo[i] = numero[i];
                    } else if (numero[i] % x == 0) {
                    }
                }
            }
        }

        // Pares //
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                par[i] = numero[i];
            }
        }
        
        // Promedio //
        for (int i = 1; i < numero.length; i++) {
            promedio = (numero[i] + promedio);
        }

        // Existencia del 100//
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] == 100){
                existencia = 1;
            }
        }

        // Suma primer elemento y ultimo //
        suma = numero[1] + numero[100];

        System.out.println();
        System.out.println("Numero mayor: ");
        System.out.print(max);

        System.out.println();
        System.out.println("Numero menor: ");
        System.out.print(min);

        System.out.println();
        System.out.println("Numeros primos: ");
        for (int i= 1; i < primo.length; i++) {
            if (primo[i] == 0){
            }else {
                System.out.print(primo[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Numeros pares: ");
        for (int i= 1; i < par.length; i++) {
            if (par[i] == 0) {
            }else{
                System.out.print(par[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Promedio: ");
        System.out.print(promedio / 100);

        System.out.println();
        System.out.println("Suma del primer y ultimo termino: ");
        System.out.print(suma);

        System.out.println();
        System.out.println("¿Hay un 100 en los numeros?: ");
        if (existencia == 1){
            System.out.print("Si");
        }else{
            System.out.print("No");
        }
    }
}
