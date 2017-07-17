package guvi;
import java.util.*;

public class Hunter34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter thr number : ");
		String n = scan.next();
		
		int n2 = Integer.parseInt(n);
		int n3 = n2 + 1;
		
		int len = n.length();
		int a[] = new int[len];
		int i =0,m=0,count=0,min=99999;
		while(n2>0){
			m = n2%10;
			a[i] = m;
			n2/=10;
			i++;
			count++;
		}
		for(i=0;i<count;i++){
			if(a[i]<min){
				min= a[i];
			}
		}
		System.out.println("Minimum number in the digit : "+min);
		if(n3>n2){
			System.out.println("The number is : "+n3);
		}
		else{
			System.out.println("wrong");
		}
		
	}

}
