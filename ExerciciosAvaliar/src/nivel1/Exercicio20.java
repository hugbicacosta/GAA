package nivel1;

import java.util.Scanner;

public class Exercicio20 {

	public Exercicio20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		int ano=2016;
		int dn;
		int af;
		int idfu;
		
		
		System.out.println("Por favor insira a sua idade:");
		idade = (new Scanner(System.in)).nextInt();
		
		dn = ano-idade;
		
		System.out.println("Nasceu em " + dn);
		System.out.println("Indique um ano no futuro");
		af = (new Scanner(System.in)).nextInt();
		
		idfu = af - dn;
		
		System.out.println("Em " + af + " tera " + idfu + " anos.");
		
		
		
	}

}
