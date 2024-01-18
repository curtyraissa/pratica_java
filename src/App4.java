// Crie uma pirâmide de números, onde você deve imprimir em cada linha 
// separada a quantidade de números que está sendo iterado no momento. 

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pirâmide: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
