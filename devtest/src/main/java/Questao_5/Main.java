package Questao_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // Criando o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando que o usuário insira uma string
        System.out.print("Digite a string para inverter: ");
        String input = scanner.nextLine();

        // Fechando o scanner
        scanner.close();

        // Chamando o método que inverte a string
        String resultado = inverterString(input);

        // Exibindo o resultado
        System.out.println("String invertida: " + resultado);
    }

    // Método que inverte a string
    public static String inverterString(String str) {
        // Criando uma nova string para armazenar o resultado
        String invertida = "";

        // Percorrendo a string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);  // Concatenando cada caractere invertido
        }

        return invertida;
    }
	        
}
