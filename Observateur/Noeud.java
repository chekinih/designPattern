package tpObservateur;
/**
 * 
 * @author 11607156 CHEKINI Hakima
 *
 */
public class Noeud {

	private String nom;
	private int valeur;
	private int coefficient;
	
	// Constructeur
	/**
	 * 
	 * @param nom
	 * @param valeur
	 * @param coefficient
	 */
	public Noeud(String nom, int valeur, int coefficient) {
		this.nom = nom;
		this.valeur = valeur;
		this.coefficient = coefficient;
	}
	
	// Guetters et setters
	/**
	 * getNom
	 * @return String
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * setNom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * getValeur
	 * @return int
	 */
	public int getValeur() {
		return valeur;
	}
	/**
	 * setValeur
	 * @param valeur
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	/**
	 * getCoefficient
	 * @return int
	 */
	public int getCoefficient() {
		return coefficient;
	}
	/**
	 * setCoefficient
	 * @param coefficient
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	/**
	 * toString
	 * return String
	 */
	public String toString()
	{
		return "("+nom+","+valeur+","+coefficient+")";
	}
	/**
	 * majValeur
	 * @param v
	 */
	public void majValeur(int v)
	{ 
		this.valeur = this.valeur + (v*this.coefficient);
	}
}
