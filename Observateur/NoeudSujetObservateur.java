package tpObservateur;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public class NoeudSujetObservateur extends NoeudSujet implements Observateur {
	/**
	 * 
	 * @param s Sujet
	 * @param nom String
	 * @param valeur int
	 * @param coefficient int
	 */
	public NoeudSujetObservateur(Sujet s, String nom, int valeur, int coefficient)
	{
		super(nom, valeur, coefficient);
		s.enregistrerObservateur(this);
	}

	@Override
	public void actualiser(int valeur) {
		this.changementValeur(valeur);
		
	}
}
