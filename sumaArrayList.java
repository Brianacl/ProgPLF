import java.util.ArrayList;
public class sumaLista{
        public static int suma(ArrayList l){
		l.remove(0);
		return (l.size() == 0) ? 0 : (int) l.get(0) + suma(l);
        }

        public static void main(String[] args){
                System.out.println(suma(new ArrayList<Integer>(){{add(1); 
			add(3); 
			add(-1);
			add(7);
			add(0);}}));
        }
}//Fin clase
