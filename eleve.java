package tp3;
import java.util.Scanner;

public class eleve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre d'élèves : ");
        int n = sc.nextInt();

        double[] notes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Note de l'élève " + (i + 1) + " /20 : ");
            notes[i] = sc.nextDouble();
        }

        double somme = 0;
        double min = notes[0];
        double max = notes[0];

        for (int i = 0; i < n; i++) {
            somme += notes[i];
            if (notes[i] < min) min = notes[i];
            if (notes[i] > max) max = notes[i];
        }

        double moyenne = somme / n;
        System.out.println("\n === Résultats === ");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note la plus grande : " + max);
        System.out.println("Note la plus petite : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);

        sc.close();
    }
}
