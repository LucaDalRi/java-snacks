import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
//      Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//      Continuare a chiedere una nuova stringa finchè non si inserisce 0.

        Scanner s1 = new Scanner(System.in);

        String userText;

        do {
            System.out.println("Scrivi una parola che contiene lettere, numeri e simboli. Scrivi 0 per terminare il programma");

            userText = s1.nextLine();

            if (!(userText.equals("0"))) {
                int userLetters = 0;
                int userNumbers = 0;
                int userSymbols = 0;

                for (int i = 0; i < userText.length(); i++) {

                    if (userText.charAt(i) >= 'a' && userText.charAt(i) <= 'z') {
                        userLetters++;
                    } else if (userText.charAt(i) >= '0' && userText.charAt(i) <= '9') {
                        userNumbers++;
                    } else {
                        userSymbols++;
                    }

                }
                System.out.println("La stringa " + userText + " contiene:");
                System.out.println(userLetters + " caratteri alfabetici");
                System.out.println(userNumbers + " caratteri numerici");
                System.out.println(userSymbols + " caratteri speciali");
            }

        } while (!(userText.equals("0")));
    }
}
