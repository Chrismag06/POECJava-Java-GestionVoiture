
public class Voiture {
	
	String marque;
	String modele; 
	int annee;
	private int vitesse;
	
	public Voiture(){
		vitesse = 0;
	}
	
	private void afficheVitesse() {
		System.out.println("La vitesse est : " + vitesse);
	}
	
	void demarrer() {
		//Démarre la voiture.
		if (vitesse == 0) {
			vitesse += 1;
		}else {
			System.out.println("La voiture roule déja!");
		}	
	}
	
	void accelerer(int vitesseAcceleration) {
		//Augmente la vitesse actuelle de la voiture.
		vitesse += vitesseAcceleration;
		afficheVitesse();
	}
	
	void freiner(int vitesseFreinage) {
		//Réduit la vitesse actuelle.
		vitesse -= vitesseFreinage;
		afficheVitesse();
	}
	
	void afficherEtat() {
		//Affiche les informations de la voiture et sa vitesse actuelle.
		System.out.println("Marque " + marque);
		System.out.println("Modèle" + modele);
		System.out.println("Année " + annee);
		System.out.println("Vitesse " + vitesse);
	}

}
