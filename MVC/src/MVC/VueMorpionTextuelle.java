package MVC;

import java.util.Scanner;

import classes_metiers.Symbole;

public class VueMorpionTextuelle implements InterfaceVueMorpion, Observateur {

	private InterfaceModelMorpion model ;
	private InterfaceControleurMorpion controlleur ;
	
	public VueMorpionTextuelle(InterfaceModelMorpion monModeleMorpion, InterfaceControleurMorpion monControleur)
	{
		monModeleMorpion.ajouterObservateur(this);
		monControleur.setVue(this);
	}
	
	public VueMorpionTextuelle(InterfaceModelMorpion model) {
		this.model = model;
		model.ajouterObservateur(this);
	}
	

	public InterfaceModelMorpion getModel() {
		return model;
	}

	public void setModel(InterfaceModelMorpion model) {
		this.model = model;
	}
	
	public InterfaceControleurMorpion getControlleur() {
		return controlleur;
	}

	public void setControlleur(InterfaceControleurMorpion controlleur) {
		this.controlleur = controlleur;
	}
	
	@Override
	public void activerVue() {
		this.afficherGrille();
		System.out.println(" À vous: " + this.model.getJoueurActif() + " de jouer ");

		
	}

	@Override
	public void afficherJoueurActif() {
		System.out.println("Le joueur actif est " + this.model.getJoueurActif());	
		
	}

	@Override
	public void afficherCoupJouer() {
		System.out.println("Le Coup joué est " + this.model.getCoupPropose());		
		
	}

	@Override
	public void afficherGrille() {
		System.out.println("Grille : ");
		Symbole [][] s = this.model.getGrille();
		 for (int l = 0; l < s.length; l++) {
			    for (int c = 0; c < s[l].length; c++) {
			       System.out.print("| " + s[l][c] + " |");;
			    }
			    System.out.println();;
			 }
		
	}

	@Override
	public int saisirLigne() {
		Scanner obj = new Scanner(System.in);
	    int ligne;
	    
	    System.out.println("Saisir une ligne pour jouer: "); 
	    ligne = obj.nextInt();   
	       
		return ligne;
	}

	@Override
	public int saisirColonne() {
		Scanner obj = new Scanner(System.in);
	    int colonne;
	    
	    System.out.println("Saisir une colonne pour jouer: "); 
	    colonne = obj.nextInt();   
	       
		return colonne;
	}

	@Override
	public void saisirCoup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherErreurCoupPropose() {
		System.out.println("Coup Invalide ");
		
	}

	@Override
	public void afficherFinDePartie() {
		System.out.println("Partie terminée ");
		
	}

	@Override
	public void setControleur(InterfaceControleurMorpion monControleur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualiser() {
		System.out.println(" c'est a " + this.model.getJoueurActif() + " de jouer ");
		
	}

}
