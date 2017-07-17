package guvi;
import java.util.*;

public class Hunter33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "");
		hm.put(2, "ABC");
		hm.put(3, "DEF");
		hm.put(4, "GHI");
		hm.put(5, "JKL");
		hm.put(6, "MNO");
		hm.put(7, "PQRS");
		hm.put(8, "TUV");
		hm.put(9, "WXYZ");
		
		for(Map.Entry em : hm.entrySet()){
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		System.out.println("Enter the number");
		int key = scan.nextInt();
		
		for(Map.Entry em : hm.entrySet()){
			int n1 =  (int) em.getKey();
			if(key==n1){
				System.out.println(em.getValue());
				break;
			}
			
		}
	}

}
