package Exo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListeDePersonnes {
	private List<Personne> liste;

    
    public void alimenterListe() {
    	Personne personne1 = new Personne("Alice", 25);
        Employe employe1 = new Employe("Bob", 30, 50000.0);
        Personne personne2 = new Personne("Charlie", 22);

        
        liste.add(personne1);
        liste.add(employe1);
        liste.add(personne2);
    }

   
    public void afficherListe() {
        for (Personne personne : liste) {
            System.out.println(personne);
        }
    }

  
    public void parcourirListe() {
        Iterator<Personne> iterator = liste.iterator();
        while (iterator.hasNext()) {
            Personne personne = iterator.next();
            System.out.println(personne);
        }
    }

    
    public void insererElement(Personne personne) {
        liste.add(personne);
    }

   
    public Personne recupererElement(int index) {
        return liste.get(index);
    }

    
    public void supprimerElement(Personne personne) {
        liste.remove(personne);
    }

    
    public boolean rechercherElement(Personne personne) {
        return liste.contains(personne);
    }

   
    public void trierListe() {
        Collections.sort(liste);
    }

    
    public Personne[] copierListe() {
        return liste.toArray(new Personne[0]);
    }

    
    public void melangerListe() {
        Collections.shuffle(liste);
    }

    public void inverserListe() {
        Collections.reverse(liste);
    }

    
    public List<Personne> extrairePartieListe(int debut, int fin) {
        return liste.subList(debut, fin);
    }

   
    public boolean comparerListes(ListeDePersonnes autreListe) {
        return this.liste.equals(autreListe.liste);
    }

    
    public void echangerElements(int index1, int index2) {
        Collections.swap(liste, index1, index2);
    }

    
    public void viderListe() {
        liste.clear();
    }

    
    public boolean estVide() {
        return liste.isEmpty();
    }

}
