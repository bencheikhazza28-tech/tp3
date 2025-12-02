package tp3;
import java.util.Scanner;

public class recherche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tableau d'exemple
        int[] tab = {4, 7, 2, 7, 9, 3, 7};
        System.out.print("Tableau : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.print("\n\nEntrez un entier à rechercher : ");
        int n = sc.nextInt();
        int indice = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("L'entier " + n + " n'appartient pas au tableau.");
        } else {
            System.out.println("L'entier " + n + " se trouve à l'indice : " + indice);
        }

        sc.close();
    }
}
