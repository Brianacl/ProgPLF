import java.util.Arrays;
public class sumaLista{
	public static int suma(int [] l){
		return (l.length == 0) ? 0 : l[0] + suma(Arrays.copyOfRange(l, 1, l.length)); 
	}
	
	public static void main(String[] args){
		System.out.println(suma(new int[] {1,3,-1,7,0}));
	}
}//Fin clase
