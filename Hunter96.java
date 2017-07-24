import java.util.*;
public class Sample {  
	
   
   
    public static void main(String[] args) {  
         Scanner scan = new Scanner(System.in);
   
		System.out.println("Enter String");
		String str1 = scan.next();
		int len = str1.length();
		int a = 0;
		String str2 = "";
		String str3 = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < len - 1; i++) {
			a = str1.charAt(i) - 97;
			if (a <= 0) {
				a += 26;
			}
			str2 += str3.charAt(a - 1);

		}
System.out.println("Encrypted String : " + str2 + str1.charAt(str1.length() - 1));
    	
    }  
}  
