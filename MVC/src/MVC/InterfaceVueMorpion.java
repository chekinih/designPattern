package MVC;

public interface InterfaceVueMorpion {
	public abstract void activerVue();
	public abstract void afficherJoueurActif();
	public abstract void afficherCoupJouer();
	public abstract void afficherGrille();
	public abstract int saisirLigne();
	public abstract int saisirColonne();
	public abstract void saisirCoup();
	public abstract void afficherErreurCoupPropose();
	public abstract void afficherFinDePartie();
	public abstract void setControleur(InterfaceControleurMorpion monControleur);
}
