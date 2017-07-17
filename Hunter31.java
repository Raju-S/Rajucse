package guvi;
import java.util.*;

public class Hunter31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		int m1=1,m2=0,max=-99999;
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				m1 = m1 * a[i];
			}
			else{
				System.out.println("Need positive elements!!!");
				break;
			}
		}
		System.out.println("Maximum product of subarray : "+m1);
		
	}

}
