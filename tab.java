package tp3;
import java.util.Arrays;
import java.util.Scanner;

public class tab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[5];

        System.out.println("Veuillez entrer 5 nombres :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            tableau[i] = sc.nextInt();
        }

        System.out.println("\nContenu du tableau avant tri :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }

        Arrays.sort(tableau);

        System.out.println("\n\nContenu du tableau après tri :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }

        sc.close();
    }
}
