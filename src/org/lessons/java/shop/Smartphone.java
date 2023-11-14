package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String IMEI;
	
	private int memoria;

	public Smartphone(int codice, String nome, String descrizione, double prezzo, int iva, String IMEI, int memoria) {
		
		super(codice, nome, descrizione, prezzo, iva);
		setIMEI(IMEI);
		setMemoria(memoria);
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String IMEI) {
		this.IMEI = IMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "IMEI: " + getIMEI() + "\n"
				+ "memoria: " + getMemoria() + "\n"
				+ "----------";
	}
	
}
