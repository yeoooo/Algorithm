package java_recursion;

import java.util.Scanner;

public class facto {
	
	static int facto(int n) {
		
		if(n <= 1) {
			return 1;
		}else {
			
			return n * facto(n-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print(facto(n));
		
	}

}
