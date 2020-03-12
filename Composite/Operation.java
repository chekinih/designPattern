/**
 * 
 * @author 11607156  chekini hakima
 *
 */
public abstract class Operation extends Expression {
	
	 Expression operande1;
	 Expression operande2;
	 
	 // Constructeur qui va initialiser les deux expressions
	 public Operation(Expression opt1, Expression opt2)
	 {
		 this.operande1 = opt1;
		 this.operande2 = opt2;
	 }
	 // Guetters
	public Expression getOperande1() {
		return this.operande1;
	}
	
	public Expression getOperande2() {
		return this.operande2;
	}
}
