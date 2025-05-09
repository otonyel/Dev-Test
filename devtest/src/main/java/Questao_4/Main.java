package Questao_4;

public class Main {
	public static void main(String[] args) {
        // Valores de faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calculando o faturamento total
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calculando os percentuais de cada estado
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        // Exibindo os resultados
        System.out.println("Percentual de faturamento de SP: " + String.format("%.2f", percentualSP) + "%");
        System.out.println("Percentual de faturamento de RJ: " + String.format("%.2f", percentualRJ) + "%");
        System.out.println("Percentual de faturamento de MG: " + String.format("%.2f", percentualMG) + "%");
        System.out.println("Percentual de faturamento de ES: " + String.format("%.2f", percentualES) + "%");
        System.out.println("Percentual de faturamento de Outros: " + String.format("%.2f", percentualOutros) + "%");
    }
}
