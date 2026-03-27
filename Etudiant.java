public class Etudiant {
    private String matricule;
    private String nom;
    private double note1;
    private double note2;
    private double note3;

    //constructeur
    public Etudiant(String matricule, String nom, double note1, double note2, double note3) {
        this.matricule = matricule;
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        }

        public double calculmoyenne() {
            return (note1 + note2 + note3) / 3;
        }
        public String mention() {
            double moyenne = calculmoyenne();
            if (moyenne >= 16) {
                return "Excellent";
            } else if (moyenne >= 14) {
                return "Très bien";
            } else if (moyenne >= 12) {
                return "BIEN";
            } else if (moyenne >= 10) {
                return "Passable";
            } else {
                return "Ajourné";
            }
        }


//affichage
public void afficherEtudiant(){
    System.out.println("Matricule: " + matricule);
    System.out.println("Nom: " + nom);
    System.out.println("Moyenne: " + calculmoyenne());
    System.out.println("Mention: " + mention());
    System.err.println("-----------------------------");
}

public double getMoyenne() {
    return calculmoyenne();
}
public String getMatricule () {
    return matricule;
}

}