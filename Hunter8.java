package guvi;
import java.util.*;

public class Hunter8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = scan.nextInt();
		int i,j,k;
		int a[] = new int[size];
		for(i=0;i<size;i++){
			a[i] = scan.nextInt();
		}
		for(i=0;i<size;i++){
			for(j=0;j<size;j++){
				for(k=0;k<size;k++){
					if(a[i]+a[j]==a[k])
					System.out.println(a[i]+" + "+a[j]+" = "+(a[i]+a[j]));
				}
			}
		}
	}

}
