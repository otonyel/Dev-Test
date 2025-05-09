package Questao_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (ehFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean ehFibonacci(int numero) {
        int a = 0, b = 1;

        if (numero == a || numero == b) return true;

        int c = a + b;
        while (c <= numero) {
            if (c == numero) return true;
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
