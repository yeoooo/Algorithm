imimport java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//brute-force_algorithm
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//펼쳐놓을 카드의 수
		int[] card = new int [N];
		int M = sc.nextInt();//딜러가 외치는 수
		int count = 0;
		int max = 0;
		
		
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();//카드를 펼쳐놓음
			
		}
		Arrays.sort(card);
		
		
			
			for(int i = 0; i < N-2; i++) {//i가 0 1 2 3 
				for(int j = i+1; j < N-1; j++) {//j 1 2 3 4 
					for(int k = j+1; k < N; k++) {//k  2 3 4 5   
						int sum = card[i] + card[j] + card[k];//card[0] + card[1] + card[2]를 sum에 입력
						if(sum <= M && sum > max) max = sum;// //sum이 M보다 작고 max보다 클 때 max에 sum을 저장
					}
				}
				
			}
		
			System.out.print(max);

	}

}
