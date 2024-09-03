package resp4;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//criando um dicionário
		Map<String, Double> estados = new HashMap<>();
		
		//inserindo dados
		  estados.put("SP", 67836.43);
	      estados.put("RJ", 36678.66);
	      estados.put("MG", 29229.88);
	      estados.put("ES", 27165.48);
	      estados.put("Outros", 19849.53);
		
	      double total = 0;
	      
	      //iterando sobre os valores e adicionando os na variável total
	      for (Double valor: estados.values()) {
	    	  total += valor;
	      }
	      
	      //iterando novamente sobre os valores e calculando o percentual de representatividade
	      for (Map.Entry<String, Double> entry : estados.entrySet()) {
	            String chave = entry.getKey();
	            Double valor = entry.getValue();
	            double percentual = (valor / total );
	            System.out.printf("Percentual de representatividade dos estados no total geral: %.2f%n ", percentual);

	      }
	}    
}

	
	