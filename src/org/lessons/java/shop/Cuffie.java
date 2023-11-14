package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	
	private boolean wireless;
	
	public Cuffie(int codice, String nome, String descrizione, double prezzo, int iva, String colore, boolean wireless) {
		
		super(codice, nome, descrizione, prezzo, iva);
		setColore(colore);
		setWireless(wireless);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "colore: " + getColore() + "\n"
				+ "wireless: " + isWireless() + "\n"
				+ "----------";
	}
}
