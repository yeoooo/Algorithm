import java.util.Scanner;

public class whileProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = A+B;
			
			if(0 >= A || B > 10) {
			
				break;
			}
			else if(0 < A || B < 10){
				System.out.println(result);				
						
			}
		}
	}

}
