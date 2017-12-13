
public class Array {

	public static void main(String[] args) {
		
		int [] conjunto = {3,6,7,1,0,5,4,9,12};
		//posiciones:	   0 1 2 3 4  5 6 7 8   
		//punteros=i
		//System.out.println("Tengo "+conjunto.length+" elementos");		
		
		//System.out.println(conjunto[0]);		
		//System.out.println(conjunto[1]);	
		//System.out.println(conjunto[2]);	
		
		//int [] conjunto2 = new int [10]
		
		for (int i=0;i<=8;i++) {
			//¿0 <= 8? SI
			System.out.println("Posición: " +i+" ---------> "+conjunto[i]); //conjunto[0]
			
		}
		
	}

}