import java.util.*;
public class fg{
        public static double[] fg(double a, double b, double c){
		return new double[] {(-b+Math.sqrt(b*b - 4*a*c))/(2*a),(-b-Math.sqrt(b*b - 4*a*c))/(2*a)};
	}
	public static void main(String[] args){
		System.out.println(Arrays.toString(fg(3,1,-5)));
	}
}
