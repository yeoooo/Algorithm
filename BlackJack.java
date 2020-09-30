import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//펼쳐놓을 카드의 수
		int[] card = new int [N];
		int M = sc.nextInt();//딜러가 외치는 수
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();//카드를 펼쳐놓음
			
		}
		Arrays.sort(card);
		
	
		for(int i : card) {
			System.out.print(i);
			
		}
		
		

	}

}
