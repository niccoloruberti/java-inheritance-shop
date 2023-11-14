package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone(233423, "t1", "desc1", 23.39, 22, "234539523", 32);
		
		Televisori t1 = new Televisori(34234, "t1", "desc1", 399, 22, 34, true);
		
		Cuffie c1 = new Cuffie(34455, "c1", "desc1", 199.99, 22, "blu", false);
		
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(c1);
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("Vuoi inserire un elemento?");
	}

}
