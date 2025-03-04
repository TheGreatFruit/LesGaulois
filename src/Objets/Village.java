package Objets;
import personnage.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nomV, int nb_case) {
		nom = nomV;
		villageois = new Gaulois [nb_case];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}

	public void setChef(Gaulois chef) {
		this.chef = chef;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		

		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);	
	}
	

	public void ajouterVillageois(Gaulois gaulois) {
		for (int i=0; i < villageois.length;i++) {
			if (villageois[i] == null) {
				villageois[i] = gaulois;
				i = villageois.length;
			}
		}	
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > villageois.length) {
			System.out.println("Il n'y a pas autant d'habitants "
					+ "dans notre village !");
			return null;
		} else {
			System.out.println(villageois[numVillageois-1]);
			return villageois[numVillageois-1];
		}
	}
	
	public void afficherVillage() {
		
	}
	
	
}
