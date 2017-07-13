package cse;
import java.util.*;

public class ArrayString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] = new int[n];
	
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter the number to delete ");
	
		int del = scan.nextInt();
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					a[i]=0;
				}
			}
		}

		for(int i=0;i<a.length;i++){
			if(a[i]!=0 && a[i]!=del)
			System.out.println(a[i]);
		}
		
		

	}

}
