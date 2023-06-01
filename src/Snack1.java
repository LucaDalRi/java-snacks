import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
//      Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

        System.out.println("Inserisci un numero, se è pari lo stampo, sennò lo faccio diventare pari io!");

        Scanner s1 = new Scanner(System.in);

        int num = s1.nextInt();

        if (num % 2 == 0) {
            System.out.println(num);
        }else {
            System.out.println(num + 1);
        }

        s1.close();
    }
}
