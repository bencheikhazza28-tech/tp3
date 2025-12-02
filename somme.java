package tp3;
import java.util.Scanner;

public class somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau (n) : ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int somme = 0;
            for (int j = 0; j <= i; j++) {
                somme += j;
            }
            tab[i] = somme;
        }

        System.out.println("\nContenu du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }

        sc.close();
    }
}
