package guvi;
import java.util.*;

public class Hunter32 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int index = 0;
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		for(int i=2;i<a.length;i+=2){
		
				index = i;
				b[i] = a[i];
			
		}
		for(int i=0;i<a.length;i++){
			if(b[i]!=0){
				System.out.println("Position : "+i+" value is : "+b[i]);
			}
		}
	}

}
