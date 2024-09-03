package entities;

public class Inverter {
		
	//Método de inversão de strings
	public static String InvertendoTexto (String str) {
		
		char[] chars =  str.toCharArray();
		
		int inicio = 0;
		int fim = chars.length -1;
		
		while (inicio < fim ) {
			char temp = chars[inicio];
			chars[inicio] = chars[fim];
			chars[fim] = temp;
			
			inicio++;
			fim--;
		}
	
		return new String(chars);
	}
	
}
