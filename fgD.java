import java.util.*;  //COMO ELIMINAR UN IF | IF TERNARIO
public class fgD{
        public static double[] fg(double a, double b, double c){
		return (b*b > 4*a*b) ?  new double[] {(-b+Math.sqrt(b*b - 4*a*c))/(2*a),(-b-Math.sqrt(b*b - 4*a*c))/(2*a)} 			  : null;
	}
	public static void main(String[] args){
		System.out.println(Arrays.toString(fg(3,1,5)));
	}
}
