import java.util.function.Function;

public class fc1 {
	/*public static Integer f(Integer x){
		return x*x + 1;
	}*/

	public static Integer g(Integer x, Function<Integer, Integer> fun){
		return fun.apply(x);
	}

	public static void main(String[] args){
		 //Metodo por referencia
		System.out.println(g(3,(x) -> x +1 )); //Anonymous function
	}
}//Fin clase

