import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
//      Data in input una stringa verificare se è palindroma

        System.out.println("Scrivi una frase per verificare se è palindroma");

        Scanner s1 = new Scanner(System.in);

        String userText = s1.nextLine();
        String reverseUserText = "";

        String noSpaceWord1 = userText.replaceAll("\\s", "");


        for (int i = 0; i < noSpaceWord1.length(); i++) {

            reverseUserText = noSpaceWord1.charAt(i) + reverseUserText;

        }

        if (noSpaceWord1.equals(reverseUserText)) {
            System.out.println("La frase " +  "-> " + userText + " <-" +" è palindroma");
        } else{
            System.out.println("La frase " +  "-> " + userText + " <-" + " non è palindroma! ");
        }

        s1.close();

    }
}
