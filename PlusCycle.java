import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		int NN = N;
		
		while(N >= 0 && 99 >= N) {
			
			
			
				int A = N / 10;//50 �� ���//5�� �ش�
				int B = N % 10;//0�� �ش�
				int result = A+B;// 5�� ����
				
				 result = (B * 10)+ (result % 10);//B * 10�� 50 result % 10�� 0�� ���� �� result��  50 ����
				N = result;//N �� 50
			
				 count ++;
				 
			
				 if(result == NN) {
					 System.out.println(count);
					 break;
				 
				
			}
		
	}

	}	}
