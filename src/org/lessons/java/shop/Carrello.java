package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
//		Smartphone s1 = new Smartphone(233423, "t1", "desc1", 23.39, 22, "234539523", 32);
//		
//		Televisori t1 = new Televisori(34234, "t1", "desc1", 399, 22, 34, true);
//		
//		Cuffie c1 = new Cuffie(34455, "c1", "desc1", 199.99, 22, "blu", false);
		
		Scanner in = new Scanner(System.in);
		
		Prodotto[] prodotti = new Prodotto[10];
		
		int i = 0;
		
		boolean fedelta = false;
		
		System.out.println("Hai la tessera fedeltà? si/no");
		fedelta = in.nextLine().equalsIgnoreCase("si");
		
		while (true) {
			
			System.out.println("Vuoi inserire un elemento? si/no");
			String ansUser = in.nextLine();
			
			if (ansUser.equals("si")) {
				
				//domande generiche
				System.out.println("Che elemento vuoi inserire? telefono/televisore/cuffie");
				String prodUser = in.nextLine();
				
				System.out.println("inserisci il codice: ");
				int codiceUser = in.nextInt();
				in.nextLine();
				
				System.out.println("Inserisi il nome: ");
				String nomeUser = in.nextLine();
				
				System.out.println("Inserisci la descrizione: ");
				String descUser = in.nextLine();
				
				System.out.println("Inserisci il prezzo: ");
				double prezzoUser = in.nextDouble();
				in.nextLine();
				
				System.out.println("Inserisci l'iva: ");
				int ivaUser = in.nextInt();
				in.nextLine();
				
					if (prodUser.equals("telefono")) {
						
						//telefono
						System.out.println("Inserisci l'IMEI: ");
						String userIMEI = in.nextLine();
						
						System.out.println("Inserisci la capacità di memoria: ");
						int userMemoria = in.nextInt();
						in.nextLine();
						
						prodotti[i] = new Smartphone(codiceUser, nomeUser, descUser, prezzoUser, ivaUser, fedelta, userIMEI, userMemoria);
						
						i++;
						
					} else if (prodUser.equals("televisore")) {
						
						//televisore
						System.out.println("Inserisci le dimensioni: (numero di pollici");
						int dimensioniUser = in.nextInt();
						in.nextLine();
						
						System.out.println("Il televisore è smart? si/no");
						boolean smartUser = (in.nextLine().equals("si")) ? true : false;
						
						prodotti[i] = new Televisori(codiceUser, nomeUser, descUser, prezzoUser, ivaUser, fedelta,  dimensioniUser, smartUser);
						
						i++;
						
					} else {
						
						//cuffie
						System.out.println("Inserisci il colore delle cuffie: ");
						String coloreUser = in.nextLine();
						
						System.out.println("le cuffie sono wireless? si/no");
						boolean wirelessUser = (in.nextLine().equals("si")) ? true : false;
						
						prodotti[i] = new Cuffie(codiceUser, nomeUser, descUser, prezzoUser, ivaUser, fedelta,  coloreUser, wirelessUser);
						
						i++;
						
					}
				
				
				} else {
					
					double prezzoTotale = 0;
					
					for (int x=0; x < i; x++) {
						System.out.println(prodotti[x]);
						
						if(fedelta) {
						prezzoTotale += prodotti[x].getPrezzoScontato();
						} else {
							prezzoTotale += prodotti[x].getPrezzoIvato();
						}
					
					}
					
					System.out.println("Il prezzo totale è: " + String.format("%.2f", prezzoTotale) + "€");
					
					break;
					
				}
		}
		
		

	}

}
