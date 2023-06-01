public class Snack9 {
    public static void main(String[] args) {
//      Calcola la somma e la media dei primi 10 numeri.

        int[] arrNum = {1,2,3,4,5,6,7,8,9,10};

        int numSum = 0;
        int numAvg;

        for (int i = 0; i < arrNum.length; i++) {

            numSum += arrNum[i];

        }

        numAvg = numSum / arrNum.length;

        System.out.println("Somma dei numeri -> " + numSum);
        System.out.println("Media dei numeri -> " + numAvg);

    }
}
