import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//���ĳ��� ī���� ��
		int[] card = new int [N];
		int M = sc.nextInt();//������ ��ġ�� ��
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();//ī�带 ���ĳ���
			
		}
		Arrays.sort(card);
		
	
		for(int i : card) {
			System.out.print(i);
			
		}
		
		

	}

}
