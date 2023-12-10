package Exo;

public class Employe extends Personne {
	
	private double salaire;

    public Employe(String nom, int age, double salaire) {
        super(nom, age);
        this.salaire = salaire;
    }
}
