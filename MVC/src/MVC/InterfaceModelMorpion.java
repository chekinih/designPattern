package MVC;

import classes_metiers.*;

public interface InterfaceModelMorpion {
	public abstract Symbole[][] getGrille();
	public abstract void jouerCoup(int ligne, int colonne) throws Exception;
	public abstract Coup getCoupPropose();
	public abstract Joueur getJoueurActif();
	public boolean partieFinie();
	public abstract void ajouterObservateur(Observateur o);
	public abstract void supprimerObservateur(Observateur o);
	public abstract void notifierObservateurs();
	public abstract void changerJActif();
	
}
