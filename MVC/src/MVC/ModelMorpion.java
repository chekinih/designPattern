package MVC;

import java.util.ArrayList;

import classes_metiers.*;


public class ModelMorpion extends Morpion implements InterfaceModelMorpion {

	private ArrayList<Observateur> observateurVues;
	private ArrayList<InterfaceControleurMorpion> controlleurs ;
	
	public ModelMorpion()
	{
		super();	
		this.observateurVues = new ArrayList<Observateur>();
		controlleurs = new ArrayList<InterfaceControleurMorpion>();
	}
	@Override
	public Symbole[][] getGrille() {
		return super.getGrille();
	}

	@Override
	public void jouerCoup(int ligne, int colonne) throws Exception{
		super.joueCoup(ligne, colonne);
		// Traiter l exception
	}

	@Override
	public Coup getCoupPropose() {
		return this.getCoupPropose();
	}

	@Override
	public Joueur getJoueurActif() {
		return super.getJoueurActif();
	}

	@Override
	public boolean partieFinie() {
		return super.partieFinie();
	}

	@Override
	public void ajouterObservateur(Observateur o) {
		this.observateurVues.add(o);		
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		this.observateurVues.remove(o);
		
	}

	@Override
	public void notifierObservateurs() {
		for(int i = 0 ; i <this.observateurVues.size() ; i ++)
		{
			this.observateurVues.get(i).actualiser() ; 
		}
		
	}
	
	@Override
	public void changerJActif() {
		super.changeJoueurActif();
		this.notifierObservateurs();
		
	}

}
