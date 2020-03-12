/**
 * 
 * @author 11607156  chekini hakima
 *
 */
public abstract class Expression {
	
	// Signature des deux méthodes valeur et toString qui vont etre définies dans les sous classes
	public abstract double valeur();
	public abstract String toString();
	
	// Par défaut, getOperande1 et getOperande2 rentourneront null pour ne pas
	// causer de problèmes pour un opérande de type nombre
	public Expression getOperande1() {
		return null;
	}
	public Expression getOperande2() {
		return null;
	}
	
}
