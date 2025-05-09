package Questao_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            // Lê o conteúdo do arquivo JSON
            String content = new String(Files.readAllBytes(Paths.get("src/main/java/Questao_3/data.json")));
            JSONObject jsonObject = new JSONObject(content);
            JSONArray faturamentoArray = jsonObject.getJSONArray("faturamento");

            // Converte os dados de faturamento em um array de double
            double[] faturamento = new double[faturamentoArray.length()];
            for (int i = 0; i < faturamentoArray.length(); i++) {
                faturamento[i] = faturamentoArray.getJSONObject(i).getDouble("valor");
            }

            // Chama os métodos para calcular os resultados
            double menorFaturamento = menorFaturamento(faturamento);
            double maiorFaturamento = maiorFaturamento(faturamento);
            double mediaMensal = mediaMensal(faturamento);
            int diasAcimaMedia = diasAcimaMedia(faturamento, mediaMensal);

            // Exibe os resultados com formatação
            System.out.printf("Menor faturamento: R$ %.2f%n", menorFaturamento);
            System.out.printf("Maior faturamento: R$ %.2f%n", maiorFaturamento);
            System.out.printf("Média mensal: R$ %.2f%n", mediaMensal);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para calcular o menor faturamento
    public static double menorFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE;
        for (double valor : faturamento) {
            if (valor > 0 && valor < menor) { // Ignora os dias sem faturamento (valor = 0)
                menor = valor;
            }
        }
        return menor;
    }

    // Método para calcular o maior faturamento
    public static double maiorFaturamento(double[] faturamento) {
        double maior = Double.MIN_VALUE;
        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    // Método para calcular a média mensal (ignorando os dias sem faturamento)
    public static double mediaMensal(double[] faturamento) {
        double soma = 0;
        int count = 0;
        for (double valor : faturamento) {
            if (valor > 0) { // Ignora os dias sem faturamento
                soma += valor;
                count++;
            }
        }
        return (count > 0) ? soma / count : 0;
    }

    // Método para calcular o número de dias com faturamento acima da média
    public static int diasAcimaMedia(double[] faturamento, double mediaMensal) {
        int contador = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                contador++;
            }
        }
        return contador;
    }
}
