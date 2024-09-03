package resp3;

import entities.Dia;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
    public static void main(String[] args) {
        
    	//Dados do xml
    	String json_1 = """
            [
                {"dia": 1, "valor": 31490.7866},
                {"dia": 2, "valor": 37277.9400},
                {"dia": 3, "valor": 37708.4303},
                {"dia": 4, "valor": 0.0000},
                {"dia": 5, "valor": 0.0000},
                {"dia": 6, "valor": 17934.2269},
                {"dia": 7, "valor": 0.0000},
                {"dia": 8, "valor": 6965.1262},
                {"dia": 9, "valor": 24390.9374},
                {"dia": 10, "valor": 14279.6481},
                {"dia": 11, "valor": 0.0000},
                {"dia": 12, "valor": 0.0000},
                {"dia": 13, "valor": 39807.6622},
                {"dia": 14, "valor": 27261.6304},
                {"dia": 15, "valor": 39775.6434},
                {"dia": 16, "valor": 29797.6232},
                {"dia": 17, "valor": 17216.5017},
                {"dia": 18, "valor": 0.0000},
                {"dia": 19, "valor": 0.0000},
                {"dia": 20, "valor": 12974.2000},
                {"dia": 21, "valor": 28490.9861},
                {"dia": 22, "valor": 8748.0937},
                {"dia": 23, "valor": 8889.0023},
                {"dia": 24, "valor": 17767.5583},
                {"dia": 25, "valor": 0.0000},
                {"dia": 26, "valor": 0.0000},
                {"dia": 27, "valor": 3071.3283},
                {"dia": 28, "valor": 48275.2994},
                {"dia": 29, "valor": 10299.6761},
                {"dia": 30, "valor": 39874.1073}
            ]
        """;
    	
    	//Dados do Json
        String json_2 = """
            [
                {"dia": 1, "valor": 22174.1664},
                {"dia": 2, "valor": 24537.6698},
                {"dia": 3, "valor": 26139.6134},
                {"dia": 4, "valor": 0.0},
                {"dia": 5, "valor": 0.0},
                {"dia": 6, "valor": 26742.6612},
                {"dia": 7, "valor": 0.0},
                {"dia": 8, "valor": 42889.2258},
                {"dia": 9, "valor": 46251.174},
                {"dia": 10, "valor": 11191.4722},
                {"dia": 11, "valor": 0.0},
                {"dia": 12, "valor": 0.0},
                {"dia": 13, "valor": 3847.4823},
                {"dia": 14, "valor": 373.7838},
                {"dia": 15, "valor": 2659.7563},
                {"dia": 16, "valor": 48924.2448},
                {"dia": 17, "valor": 18419.2614},
                {"dia": 18, "valor": 0.0},
                {"dia": 19, "valor": 0.0},
                {"dia": 20, "valor": 35240.1826},
                {"dia": 21, "valor": 43829.1667},
                {"dia": 22, "valor": 18235.6852},
                {"dia": 23, "valor": 4355.0662},
                {"dia": 24, "valor": 13327.1025},
                {"dia": 25, "valor": 0.0},
                {"dia": 26, "valor": 0.0},
                {"dia": 27, "valor": 25681.8318},
                {"dia": 28, "valor": 1718.1221},
                {"dia": 29, "valor": 13220.495},
                {"dia": 30, "valor": 8414.61}
            ]
        """;

        // Convertendo as strings JSON para listas de objetos Dia
        List<Dia> diasJson1 = parseJsonToDiaList(json_1);
        List<Dia> diasJson2 = parseJsonToDiaList(json_2);

        // Calculando e exibindo resultados
        System.out.println("JSON 1:");
        processFaturamento(diasJson1);

        System.out.println("\nJSON 2:");
        processFaturamento(diasJson2);
    }
    
    //Usando método para parsear o json
    private static List<Dia> parseJsonToDiaList(String json) {
        List<Dia> dias = new ArrayList<>();
        return dias;
    }
    
    //Usando método para processar e calcular os valores
    private static void processFaturamento(List<Dia> dias) {
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (Dia dia : dias) {
            if (dia.temFaturamento()) {
                if (dia.getValor() < menorValor) {
                    menorValor = dia.getValor();
                }
                if (dia.getValor() > maiorValor) {
                    maiorValor = dia.getValor();
                }
                soma += dia.getValor();
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (Dia dia : dias) {
            if (dia.temFaturamento() && dia.getValor() > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
