package cse;
import java.util.*;

public class Guvi70 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] =new int[n];
		
		
		for(int i=0;i<n;i++){
			a1.add(scan.nextInt());
		}
		
		System.out.println("Enter the number to search : ");
		int n1 = scan.nextInt();
		
		Iterator it1 = a1.iterator();
		while(it1.hasNext()){
			if(a1.contains(n1)){
			System.out.println("TRUE");
			break;
			}
		else{
			System.out.println("FALSE ");
			break;
		}
		
		}
	}

}
