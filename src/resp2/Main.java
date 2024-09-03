package resp2;

import java.util.Scanner;

import entities.Fibonacci;

public class Main {

	public static void main(String[] args) {
		
		//alocando a classe que contém o método de verificação se o número é ou não Fibonacci
		Fibonacci fb = new Fibonacci();
		
		//alocando o inputador de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		//método da classe que verifica se o número é ou não Fibonacci
		if (fb.isFibonacci(numero)) {
			System.out.println("O número " + numero  + " pertecence a sequência Fibonnacci");
		} else {
			System.out.println("O número " + numero  + " não pertecence a sequência Fibonnacci");
		}

	}
	
	
}
