// Faça um algoritmo para receber um número qualquer e imprimir na tela 
// se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            if (numero > 0) {
                System.out.println(numero + " é par e positivo.");
            } else if (numero < 0) {
                System.out.println(numero + " é par e negativo.");
            } else {
                System.out.println(numero + " é zero.");
            }
        } else {
            if (numero > 0) {
                System.out.println(numero + " é ímpar e positivo.");
            } else if (numero < 0) {
                System.out.println(numero + " é ímpar e negativo.");
            } else {
                System.out.println(numero + " é zero.");
            }
        }

        scanner.close();
    }
}