package java_recursion;

import java.util.Scanner;

public class fibonacci {
	
	static int fibo(int n) {
		
		if(n == 0 || n == 1) {			
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
		
	}
	
	public void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		System.out.println(fibo(n));
	}

}
