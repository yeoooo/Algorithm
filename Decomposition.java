import java.util.*;


public class Decomposition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//�ڿ���N 
							 //�ڽŰ� �� �ڸ��� ���� ���� ������ �ڿ���N�� ã�� ��
		
		int result = 0;
	

		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;//sum = (sum + number % 10) �� �ڸ����� ��
				number /= 10;//�ڸ��� ����
			}
			if(sum + i == N) {//�� �ڸ����� �� + i�� N�� ���ٸ� ��, i(������)�� ã�Ҵٸ� 
				result = i;
				break;
			}
		}
		System.out.println(result);

	}
}
	

