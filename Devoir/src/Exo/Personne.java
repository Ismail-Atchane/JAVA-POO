package Exo;

public class Personne implements Comparable<Personne>, Cloneable {
	    private String nom;
	    private int age;

	    
	    public Personne(String nom, int age) {
	        this.nom = nom;
	        this.age = age;
	    }

	    
	    @Override
	    public String toString() {
	        return "Personne [nom=" + nom + ", age=" + age + "]";
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Personne personne = (Personne) obj;
	        return age == personne.age && nom.equals(personne.nom);
	    }

	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	    @Override
	    public int compareTo(Personne autrePersonne) {
	        return Integer.compare(this.age, autrePersonne.age);
	    }
}
