public class fc {
	public static Integer f(Integer x){
		return x + 1;
	}

	interface Enteros {
		Integer procesa(Integer x);
	}

	public static Integer g(Integer x, Enteros fun){
		return fun.procesa(x);
	}

	public static void main(String[] args){
		Enteros funcion = fc::f; //Metodo por referencia
		System.out.println(f(3));
	}
}//Fin clase

