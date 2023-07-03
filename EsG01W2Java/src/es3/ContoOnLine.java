package es3;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	 @Override
	    public void preleva(double importo) throws BancaException {
	        if (importo > maxPrelievo) {
	            throw new BancaException("Il prelievo non è disponibile");
	        }

	        super.preleva(importo);
	    }
	}

