import java.util.Random;
public class Snack2 {
    public static void main(String[] args) {
//      Generatore di “nomi cognomi” casuali:
//      il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        String[] name = {"Luca", "Mattia", "Fabio", "Alessandro", "Giorgio", "Francesco", "Mauro"};
        String[] lastname = {"Rossi","Verdi","Bianchi","Neri","Gialli","Viola","Arancioni"};

        Random random = new Random();

        for (int i = 0; i < name.length; i++) {

            int number = random.nextInt(7);

            System.out.println(name[number] + " " + lastname[number]);

        }

    }
}
