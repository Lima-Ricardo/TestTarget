package entities;

public class Dia {
    
	
	private int dia;
    private double valor;
    
    public Dia(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }

    public boolean temFaturamento() {
        return valor > 0;
    }
}
