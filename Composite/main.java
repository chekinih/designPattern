

/**
 * 
 * @author 11607156  chekini hakima
 *
 */
public class main {

	public static void main(String[] args) {
		
		Operation op1 = new Addition(new Nombre(3), new Nombre(4));
		Operation op2 = new Soustraction( new Nombre(10), new Nombre(6));
		Operation op3 = new Multiplication(new Nombre(5), op2);
		Operation res = new Division(op1, op3);
		System.out.println(res.valeur());
		System.out.println(res);
	
		
		
	}

}
