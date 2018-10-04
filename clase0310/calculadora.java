import java.util.function.DoubleBinaryOperator;

public class calculadora{

	public static double sumar(double a,double b){
    		return a + b;
	}

	public static double restar(double a, double b){
    		return a - b;
	}

	public static double multiplicar(double a,double b){
    		return a*b;
	}

	public static double dividir(double a,double b){
    		return a/b;
	}

	public static double calc(DoubleBinaryOperator op,double v1,double v2){
    		return op.applyAsDouble(v1,v2);
	}

	public static void main(String[] args){
		System.out.println(calc(calculadora :: sumar,2,3));
		System.out.println(calc(calculadora :: restar,2,3));
		System.out.println(calc(calculadora :: multiplicar,2,3));
		System.out.println(calc(calculadora :: dividir,2,3));
	}
}//Fin clase
