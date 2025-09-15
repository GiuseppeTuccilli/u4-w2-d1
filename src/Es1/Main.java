package Es1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[5];
        int sel;
        String input = "";

        for (int i = 0; i < ar.length; i++) {
            double rmd = Math.random();
            int ran = (int) ((rmd * 9) + 1);
            ar[i] = ran;
        }

        while (true) {
            int val = 0;
            String valch = "";
            System.out.println("Array di 5 elementi:");
            System.out.println(Arrays.toString(ar));
            System.out.println("Quale elemento vuoi modificare?");
            System.out.println("inserisci un numero da 1 a 5 oppure 0 per terminare");
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            try {
                sel = Integer.parseInt(input);
                if (sel > 0 && sel <= 5) {
                    System.out.println("inserire il nuovo valore per la posizione " + sel);
                    valch = scanner.nextLine();
                    try {
                        val = Integer.parseInt(valch);
                        ar[sel - 1] = val;
                    } catch (NumberFormatException ex) {
                        System.out.println("input non valido" + ex.getMessage());
                    }

                } else {
                    System.out.println("input non valido");
                }

            } catch (NumberFormatException ex) {
                System.out.println("input non valido" + ex.getMessage());
            }
        }


    }
}
