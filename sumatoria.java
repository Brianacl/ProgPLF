public class sumatoria{
	public static int sumatoria_(int n){
		return (n == 0) ? 0 : n + sumatoria_(n-1);
	}

	public static void main(String[] args){
		System.out.println(sumatoria_(4));
	}
}
