package nivel0;

import java.util.Scanner;

public class Exercicio18 {

	public Exercicio18() {
		// TODO Auto-generated constructor stub
	

	int num1;
	int num2;
	float media;
	
	System.out.println("por favor insira o numero a");
	num1 = (new Scanner(System.in)).nextInt();
	System.out.println("por favor insira o numero b");
	num2 = (new Scanner(System.in)).nextInt();
	
	if (num1>num2){
		System.out.println("O numero a e o maior");
	}
	else {
		System.out.println("O numero b e o maior");
	}
	
	media = (num1+num2)/2;
			
	System.out.println("A media inserida e" + media);

	
	}
}
