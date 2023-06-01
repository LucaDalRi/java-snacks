public class Snack3 {
    public static void main(String[] args) {
//      Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        int[] arrInt = {1,3,12,14,56,54,31,12,22};

        int total = 0;

        for (int i = 0; i < arrInt.length; i++) {

            if (i % 2 != 0) {

                total += arrInt[i];

            }

        }

        System.out.println(total);

    }
}
