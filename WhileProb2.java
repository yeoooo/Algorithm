import java.util.Scanner;

public class WhileProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {//EOF처리 While 문제 2
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = A+B;
			System.out.println(result);
			
			
			}
		sc.close();
		}
	}


