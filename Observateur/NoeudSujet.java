package tpObservateur;

import java.util.ArrayList;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public class NoeudSujet extends Noeud implements Sujet{
	
	private ArrayList<Observateur> observateurs;
	/**
	 * 
	 * @param nom
	 * @param valeur
	 * @param coefficient
	 */
	public NoeudSujet(String nom, int valeur, int coefficient)
	{
		super(nom, valeur, coefficient);
		this.observateurs =new ArrayList<Observateur>() ; 
	}
	@Override
	public void enregistrerObservateur(Observateur o)
	{
		this.observateurs.add(o);
	}
	@Override
	public void supprimerObservateur(Observateur o) {
		this.observateurs.remove(o);
		
	}
	@Override
	public void notifierObservateurs() {
		for(int i = 0 ; i <this.observateurs.size() ; i ++)
		{
			this.observateurs.get(i).actualiser(this.getValeur()) ; 
		}
		
	}
	/**
	 * changementValeur
	 * @param v
	 */
	public void changementValeur(int v)
	{
		this.majValeur(v);
		this.notifierObservateurs();
	}
}
