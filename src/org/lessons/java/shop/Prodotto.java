package org.lessons.java.shop;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	public Prodotto (int codice, String nome, String descrizione, double prezzo, int iva) {
		
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
		
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
	
	public double getPrezzoIvato() {
		return prezzo = prezzo + (prezzo / 100 * iva);
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
				+ "----------";
	}
}
