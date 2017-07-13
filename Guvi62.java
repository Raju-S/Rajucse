package cse;
import java.util.*;

public class Guvi62 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		int max=-99999,min=99999;
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		int maxbenefit = max - min ;
		System.out.println("Maximum benefit "+max+" - "+min+" = "+(max-min)+" thousand");
		
	}

}