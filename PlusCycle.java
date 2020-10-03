import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		int NN = N;
		
		while(N >= 0 && 99 >= N) {
			
			
			
				int A = N / 10;//50 일 경우//5에 해당
				int B = N % 10;//0에 해당
				int result = A+B;// 5을 만들어냄
				
				 result = (B * 10)+ (result % 10);//B * 10은 50 result % 10은 0이 나옴 즉 result에  50 저장
				N = result;//N 은 50
			
				 count ++;
				 
			
				 if(result == NN) {
					 System.out.println(count);
					 break;
				 
				
			}
		
	}

	}	}
