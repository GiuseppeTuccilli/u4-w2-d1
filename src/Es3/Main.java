package Es3;

import Es3.entities.ContoCorrente;
import Es3.entities.ContoOnLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto = new ContoCorrente("Pippo", 5000);
        ContoOnLine contoOnLine = new ContoOnLine("pluto", 6000, 5);

        String input = "";
        double sum = 0;


        while (true) {
            System.out.println("inserire 1 per selezionare il Conto OffLine");
            System.out.println("inserire 2 per selezionare il Conto OnLine");
            System.out.println("inserire q per terminare");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            if (input.equals("1")) {
                System.out.println("Conto offLine");
                System.out.println("Quanto vuoi prelevare? (inserire un numero positivo)");
                input = scanner.nextLine();
                try {
                    sum = Double.parseDouble(input);
                    if (sum < 0) {
                        throw new Exception();
                    }
                    conto.preleva(sum);
                    System.out.println("saldo: " + conto.restituisciSalso());
                } catch (Exception ex) {
                    System.out.println("input non valido");
                }
            } else if (input.equals("2")) {
                System.out.println("Conto onLine");
                System.out.println("Quanto vuoi prelevare? (inserire un numero positivo)");
                input = scanner.nextLine();
                try {
                    sum = Double.parseDouble(input);
                    if (sum < 0) {
                        throw new Exception();
                    }
                    contoOnLine.preleva(sum);
                    System.out.println("saldo: " + contoOnLine.restituisciSalso());
                } catch (Exception ex) {
                    System.out.println("input non valido");
                }
            } else {
                System.out.println("input non valido");
            }
        }
    }
}
