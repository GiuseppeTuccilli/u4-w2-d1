package Es2;

import Es2.exeptions.DivPerZeroExeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = 0, lit = 0;
        String kmSt = "", litSt = "";
        boolean ok = false;
        while (true) {
            if (ok) {
                break;
            }
            System.out.println("quanti kilometri hai percorso? (inserire un numero)");
            kmSt = scanner.nextLine();

            try {
                km = Integer.parseInt(kmSt);
                ok = true;
            } catch (NumberFormatException ex) {
                System.out.println("input non valido " + ex.getMessage());
            }
        }

        ok = false;
        while (true) {
            if (ok) {
                break;
            }
            System.out.println("quanti litri hai consumato?");
            litSt = scanner.nextLine();
            try {
                lit = Integer.parseInt(litSt);
                ok = true;
            } catch (NumberFormatException ex) {
                System.out.println("input non valido " + ex.getMessage());
            }
        }
        ok = false;

        try {
            if (lit == 0) {
                throw new DivPerZeroExeption("non si può dividere per 0");
            }
            double result = km / lit;
            System.out.println("km su litro = " + result);

        } catch (DivPerZeroExeption ex) {
            System.out.println(ex.getMessage());
        }
    }
}
