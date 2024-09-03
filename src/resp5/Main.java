package resp5;

import java.util.Scanner;

import entities.Inverter;

public class Main {

	public static void main(String[] args) {
		
		
		//alocando a classe que contém o método de inversão das strings
		Inverter inv = new Inverter();
		
		//alocando o iputador de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma texto a ser invertido: ");
		
		String texto =  sc.nextLine();
		
		//usando o método da classe inverter
		inv.InvertendoTexto(texto);
		
		System.out.println("Texto Invertido: " + texto);
	}

}
