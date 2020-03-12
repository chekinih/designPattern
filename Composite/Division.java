/**
 * 
 * @author 11607156  chekini hakima
 *
 */
public class Division extends Operation{
	
	public Division(Expression opt1, Expression opt2)
	{
		// Appel du constructeur de la classe mère
		super(opt1, opt2);
	}
	
	// Definition des méthodes abstraites
	public double valeur()
	{
		return this.getOperande1().valeur() / this.getOperande2().valeur();
	}
	
	public  String toString()
	{
		return "( " + this.getOperande1().toString()+ " / " + this.getOperande2().toString() + ")";
	}
}
