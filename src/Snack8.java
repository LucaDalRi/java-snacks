import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
//      Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero

        System.out.println("Inserisci un numero, ti darò la somma delle cifre scomposte dal tuo numero");

        Scanner s1 = new Scanner(System.in);

        String charNum = s1.nextLine();

        int total = 0;

        for (int i = 0; i < charNum.length(); i++) {

            String singleChar = charNum.substring(i , i + 1);

            int charToInt = Integer.parseInt(singleChar);

            total += charToInt;

        }

        System.out.println(total);

        s1.close();

    }
}
