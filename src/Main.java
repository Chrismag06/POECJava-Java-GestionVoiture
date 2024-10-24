import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture voiture = new Voiture();
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entrez une marque ");
		voiture.marque = myObj.next();
		
		System.out.println("Entrez un modèle ");
		voiture.modele = myObj.next();
		
		System.out.println("Entrez une année ");
		voiture.annee = myObj.nextInt();
		
		voiture.afficherEtat();
		
		voiture.demarrer();
		
		voiture.afficherEtat();
		
		voiture.accelerer(10);
		
		voiture.afficherEtat();
		
		voiture.freiner(5);
		
		voiture.afficherEtat();
		
		myObj.close();
		
	}

}
