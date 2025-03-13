package Objets;
import personnage.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nomV, int nb_case, Gaulois chef) {
		this.nom = nomV;
		this.villageois = new Gaulois [nb_case];
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}

	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);
		abraracourcix.sePrésenter();
		asterix.sePrésenter();
		doublepolemix.sePrésenter();
		
	}
	

	public void ajouterVillageois(Gaulois gaulois) {
		for (int i=0; i < villageois.length;i++) {
			if (villageois[i] == null) {
				villageois[i] = gaulois;
				i = villageois.length;
				gaulois.setVillage(this);
			}
		}	
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois-1] == null) {
			System.out.println("Il n'y a pas autant d'habitants "
					+ "dans notre village !");
			return null;
		} else {
			return villageois[numVillageois-1];
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le " + getNom() + " du chef "
				+ getChef() + " vivent les légendaires gaulois : ");
		for (int i = 0; i < villageois.length; i++)
		{
			if (villageois[i] == null)
			{
				i = villageois.length;
			}
			else
			{
				System.out.println("- " + villageois[i].getNom());
			}
		}
	}
	
	
}
