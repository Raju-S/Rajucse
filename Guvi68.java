package cse;
import java.util.*;

public class Guvi68 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] =new int[n];
		int len = a.length;
		int index=0;
		int b[] = new int[len];
		int max=-99999;
		
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++){
			b[i] = a[i] - a[i+1];
			if(b[i]>=max){
				max=b[i];
				index = i;
			}
		}
		
		System.out.println("Maximum is : "+max+" its index is : "+index);
		
		
		
	}

}
