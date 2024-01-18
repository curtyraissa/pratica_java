// Escreva um código que deve imprimir a tabela de multiplicação de 
// algum número fornecido além de exibir um cabeçalho com o nome 
// Tabela de multiplicação de X, onde X é o número a ser multiplicado.

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de multiplicação por " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
