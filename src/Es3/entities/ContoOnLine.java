package Es3.entities;

import Es3.exeptions.BancaExeption;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + this.titolare + " - saldo: " + this.saldo +
                " - Num movimenti: " + this.nMovimenti + " - Massimo movimenti: "
                + this.maxMovimenti + " - Massimo prelievo possibile: " + this.maxPrelievo);
    }

    public void preleva(double x) {
        try {
            if (x <= maxPrelievo) {
                super.preleva(x);
            } else {
                throw new BancaExeption("il prelievo non è disponibile");
            }
        } catch (BancaExeption ex) {
            System.out.println(ex.getMessage());
        }
    }
}
