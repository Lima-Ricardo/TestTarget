package entities;

public class Fibonacci {
	
	//Método de verificação de números Fibonacci
	public static boolean isFibonacci(int num) {
        
		if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, c = 1;
        
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == num;
    }
	
}



