package guvi;
import java.util.*;

public class Hunter7 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size = scan.nextInt();
	int a[] = new int[size];
	int aa[] = new int[size];
	int i,j,a1=0,a2=0;
	int count = 0;
	for(i=0;i<size;i++){
		a[i] = scan.nextInt();
	}
	for(i=0;i<size;i++){
		for(j=i+1;j<size;j++){
			if(a[i]==a[j]){
				
				a[i] = 0;
				a[j] = 0;
			}
			
		}
	}
	for(i=0;i<a.length;i++){
		if(a[i]!=0){
			System.out.println(a[i]);
		}
	}
	
	
	}

}
