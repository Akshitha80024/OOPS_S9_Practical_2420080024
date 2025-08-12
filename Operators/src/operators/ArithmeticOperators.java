package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a=10 , b=5;
		// Arithmetic operators
		System.out.println("Addition:"+(a+b));
	    System.out.println("Subtraction:"+(a-b));
	    System.out.println("Multiplication:"+(a*b));
	    System.out.println("Division:"+(a/b));
	    //Unary operators
	    System.out.println(a++);
	    System.out.println(--b);
	    //Relational operators
	    System.out.println(a==b);
	    System.out.println(a>b);
	    System.out.println(a<b);
	    System.out.println(a!=b);
	}

}
