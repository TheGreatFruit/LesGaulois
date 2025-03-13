package personnage;
import Objets.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + ": ";
	}
	
	public void sePrésenter() {
		if (this.village.getChef().getNom() == this.getNom()) {
			parler("Bonjour, je m'appelle " + getNom() + "."
					+ " Je suis le chef du village " + village.getNom()
					+ ".");
		} 
		else if (this.village == null) {
			parler("Bonjour, je m'appelle " + getNom() + "."
					+ " Je voyage de villages en villages.");
		} else {
			parler("Bonjour, je m'appelle " + getNom() + "."
					+ " J'habite le village " + village.getNom()
					+ ".");
		}
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la" + " mâchoire" + " de " + nomRomain + ".");
		int forceCoup = (force * effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion > 1) {
			effetPotion -= 1;
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());

	}

	@Override
	public String toString() {
		return nom;
	}

}
