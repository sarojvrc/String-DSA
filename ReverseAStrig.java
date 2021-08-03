package dsa;

import java.util.Scanner;

public class ReverseAStrig {
	
	//method
	static void Reverse(String str) {
		int length = str.length();
		String rev = "";
		for(int i=length-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		System.out.println("The String is "+str);
		
		//reverse
		ReverseAStrig.Reverse(str);
	}

}
