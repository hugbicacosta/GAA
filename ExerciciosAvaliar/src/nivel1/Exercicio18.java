package nivel1;

import java.util.Scanner;

public class Exercicio18 {

	public Exercicio18() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int cont;
		
		
		System.out.println("Por favor insira um numero a sua escolha:");
		num = (new Scanner(System.in)).nextInt();
		
		for (int i=0; i<num; i++){
		
			if (num%i==0){
			cont++;
		}
			if (cont<=2){
			System.out.println("O numero e primo");
		}
			else{
				System.out.println("O numero nao e primo");
			}
		
		
		}
		}
}
