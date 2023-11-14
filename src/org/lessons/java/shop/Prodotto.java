package org.lessons.java.shop;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	private boolean fedelta;
	
	public Prodotto (int codice, String nome, String descrizione, double prezzo, int iva, boolean fedelta) {
		
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
		setFedelta(fedelta);
		
	}
	
	public int getCodice() {
		return codice;
	}
	
	private void setCodice(int codice ) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public boolean isFedelta() {
		return fedelta;
	}

	public void setFedelta(boolean fedelta) {
		this.fedelta = fedelta;
	}

	public double getPrezzoIvato() {
		return prezzo + (prezzo / 100 * iva);
	}
	
	public String getNomeEsteso() {
		return codice + "-" + nome;
	}
	
	public String getCodicePad() {
		
		String codiceStr = Integer.toString(codice);
		
		if (codiceStr.length() < 8) {
			while (codiceStr.length() < 8) {
				codiceStr = '0' + codiceStr;
			}
		}
		
		return codiceStr;
	}
	
	public double getPrezzoScontato() {
	 
	        if (this instanceof Smartphone) {
	            Smartphone smartphone = (Smartphone) this;
	            if (smartphone.getMemoria() < 32) {
	                return getPrezzoIvato() * 0.95;
	            }
	        } else if (this instanceof Televisori) {
	            Televisori televisore = (Televisori) this;
	            if (!televisore.isSmart()) {
	                return getPrezzoIvato() * 0.93;
	            }
	        } else if (this instanceof Cuffie) {
	            Cuffie cuffie = (Cuffie) this;
	            if (!cuffie.isWireless()) {
	                return getPrezzoIvato() * 0.90;
	            }
	        }

	        return getPrezzo() * 0.98; 

	}
	
	@Override
	public String toString() {
	    return "Prodotto:\n"
        + "codice: " + getCodice() + "\n"
        + "nome: " + getNome() + "\n"
        + "descrizione: " + getDescrizione() + "\n"
        + "prezzo: " + getPrezzo() + "€\n"
        + "iva: " + getIva() + "%\n"
        + "prezzo ivato: " + String.format("%.02f", getPrezzoIvato()) + "€\n"
        + "nome completo: " + getNomeEsteso() + "\n"
        + "codice con pad left: " + getCodicePad() + "\n"
        + (isFedelta()? ("il prezzo scontato e' di: " + String.format("%.02f", getPrezzoScontato())+ "€"):("")) + "\n";
	    
	}
	
}
