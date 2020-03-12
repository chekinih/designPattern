package tpObservateur;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public class NoeudObservateur extends Noeud implements Observateur{

	/**
	 * 
	 * @param s
	 * @param nom
	 * @param valeur
	 * @param coefficient
	 */
	public NoeudObservateur(Sujet s, String nom, int valeur, int coefficient) {
		super(nom, valeur, coefficient);
		s.enregistrerObservateur(this);
		
	}

	@Override
	public void actualiser(int valeur) {
		this.majValeur(valeur);
		
	}

}
