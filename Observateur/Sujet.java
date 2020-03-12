package tpObservateur;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public interface Sujet {
	/**
	 * 
	 * @param o Observateur
	 */
	public abstract void enregistrerObservateur(Observateur o);	
	/**
	 * 
	 * @param o Observateur
	 */
	public abstract void supprimerObservateur(Observateur o);
	public abstract void notifierObservateurs();	

}
