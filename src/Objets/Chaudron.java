package Objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public boolean contientPotion() {
		if (quantitePotion == 0) {
			return false;
		}
		return true;
	}

	public int prendreLouche() {
		if (contientPotion() == false) {
			this.forcePotion = 0;
		} else {
			this.quantitePotion -= 1;
		}
		return forcePotion;
	}

}
