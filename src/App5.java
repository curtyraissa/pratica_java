// Escreva um código que encontre os elementos em comum que existem em 
// dois arrays e imprima no console quais são esses elementos, um a um.

public class App5 {
    public static void main(String[] args) {
        // Entrada
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui", "Amora"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};
        imprimirElementosComuns(array1, array2);
    }
    public static void imprimirElementosComuns(String[] array1, String[] array2) {
        System.out.println("Elementos comuns:");
        for (String elemento1 : array1) {
            for (String elemento2 : array2) {
                if (elemento1.equals(elemento2)) {
                    System.out.println(elemento1);
                    break;
                }
            }
        }
    }
}
