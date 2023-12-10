package Exo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TablePersonne {
	private Personne[] tableau;

    public TablePersonne(Personne[] personnes) {
        this.tableau = personnes;
    }

   
    public void trierTableau() {
        Arrays.sort(tableau);
    }

   
    public void ajouterElement(Personne personne) {
    	Personne[] nouveauTableau = new Personne[tableau.length + 1];
        
        System.arraycopy(tableau, 0, nouveauTableau, 0, tableau.length);

        nouveauTableau[nouveauTableau.length - 1] = personne;

        tableau = nouveauTableau;

    }

    public void supprimerElement(Personne personne) {
    	int p = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].equals(personne)) {
                p = i;
                break;
            }
        }

        
        if (p != -1) {
            Personne[] nouveauTableau = new Personne[tableau.length - 1];
            System.arraycopy(tableau, 0, nouveauTableau, 0, p);
            System.arraycopy(tableau, p + 1, nouveauTableau, p, tableau.length - p - 1);

            
            tableau = nouveauTableau;
        }
    }

    
    public int compterElements() {
        return tableau.length;
    }

   
    public void inverserOrdreTableau() {
        List<Personne> liste = Arrays.asList(tableau);
        Collections.reverse(liste);
        tableau = liste.toArray(new Personne[0]);
    }

    
    public void afficherTableau() {
        for (Personne personne : tableau) {
            System.out.println(personne);
        }
    }

   
    public Personne elementLePlusGrand() {
    	if (tableau.length == 0) {
            
            return null;
        }

       
        Personne personneMax = tableau[0];

 
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i].compareTo(personneMax) > 0) {
                personneMax = tableau[i];
            }
        }

        return personneMax;
    }


    public boolean estEgal(TablePersonne aTableau) {
    	return Arrays.equals(this.tableau, aTableau.tableau);
 
    }
}
