/**
 * 
 * @author 11607156  chekini hakima
 *
 */
public class Nombre extends Expression {
	
	private double valeurNombre;
	
	// Constructeur qui va initialiser valeurNombre par la valeur passée en paramètre 
	public Nombre(double v)
	{
		this.valeurNombre = v;
	}
	
	// Definition des méthodes abstraites
	public double valeur()
	{
		return this.valeurNombre;
	}
	
	public  String toString()
	{
		return (""+this.valeurNombre);
	}
	
}
