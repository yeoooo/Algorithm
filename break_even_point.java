import java.util.Scanner;

public class break_even_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count = 0;
		
		if(B==C) {
			System.out.println("-1");
		}else {
				count = (A / (C - B)) + 1; //손익 분기점 공식
				
				if(count < 1) {//손익 분기점이 안나오면
					System.out.println("-1");
				}else {
					System.out.println(count);
				}
			
		}
		
		
	
	}

}
