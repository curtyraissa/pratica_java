// Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        int tamanhoSequencia = scanner.nextInt();

        System.out.println("Sequência de Fibonacci de tamanho " + tamanhoSequencia + ":");
        imprimirFibonacci(tamanhoSequencia);

        scanner.close();
    }

    public static void imprimirFibonacci(int tamanho) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
