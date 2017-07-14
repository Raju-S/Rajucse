package guvi;
import java.util.*;

public class Hunter11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] names = {"Kannan","Mugundhan","Krishnan","Muralidharan","Purusothaman"};
		System.out.println("Given order :");
		
		for(String name : names){
			System.out.println(name);
		}
		System.out.println("Reverse order ");
		for(int i=names.length-1;i>=0;i--){
			System.out.println(names[i]);
		}

	}

}
