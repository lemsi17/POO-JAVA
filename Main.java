import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Entrez le nombre d'étudiants: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consomme la nouvelle ligne après nextInt()
            Etudiant[] etudiants = new Etudiant[n];
            for (int i =0;i<n;i++){
                System.out.println("Entrez les informations de l'étudiant " + (i+1) + ":");
                System.out.print("Matricule: ");
                String matricule = sc.nextLine();
                System.out.print("Nom: ");
                String nom = sc.nextLine();
                System.out.print("Note 1: ");
                double note1 = sc.nextDouble();
                System.out.print("Note 2: ");
                double note2 = sc.nextDouble();
                System.out.print("Note 3: ");
                double note3 = sc.nextDouble();
                sc.nextLine(); // Consomme la nouvelle ligne après nextDouble()
                etudiants[i] = new Etudiant(matricule, nom, note1, note2, note3);
            }
            System.out.println("\nInformations des étudiants:");
            for (Etudiant e : etudiants) {
                e.afficherEtudiant();
            }
            // Affichage de l'étudiant avec la meilleure moyenne
            double somme =0;
            for (Etudiant e : etudiants) {
                somme += e.getMoyenne();
            }
            double moyenneGenerale = somme / n;
            System.out.println("\nMoyenne générale: " + moyenneGenerale);

            //best etudiant
            Etudiant bestEtudiant = etudiants[0];
            for (Etudiant e : etudiants) {
                if (e.getMoyenne() > bestEtudiant.getMoyenne()) {
                    bestEtudiant = e;
                }
            }
            System.out.println("\nL'étudiant avec la meilleure moyenne est:");
            bestEtudiant.afficherEtudiant();
            

        int admis = 0;
        for (Etudiant e : etudiants) {
            if (e.getMoyenne() >= 10) {
                admis++;
            }
        }
        System.out.println("\nNombre d'étudiants admis: " + admis);
        sc.close(); // Fermer le Scanner
    }

}