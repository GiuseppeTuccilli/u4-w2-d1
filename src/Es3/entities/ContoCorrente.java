package Es3.entities;

import Es3.exeptions.BancaExeption;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        try {
            if (saldo - x < 0) {
                throw new BancaExeption("il conto è in rosso");
            } else {
                if (nMovimenti <= maxMovimenti) saldo = saldo - x;
                else saldo = saldo - x - 0.50;
            }
        } catch (BancaExeption ex) {
            System.out.println(ex.getMessage());
        }
        nMovimenti++;
    }

    public double restituisciSalso() {
        return this.saldo;
    }
}
