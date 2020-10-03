import java.util.*;


public class Decomposition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//자연수N 
							 //자신과 각 자리의 수를 더한 값으로 자연수N을 찾는 것
		
		int result = 0;
	

		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;//sum = (sum + number % 10) 각 자릿수의 합
				number /= 10;//자리수 변동
			}
			if(sum + i == N) {//각 자리수의 합 + i가 N과 같다면 즉, i(생성자)를 찾았다면 
				result = i;
				break;
			}
		}
		System.out.println(result);

	}
}
	

