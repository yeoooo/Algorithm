imimport java.util.Arrays;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//brute-force_algorithm
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//���ĳ��� ī���� ��
		int[] card = new int [N];
		int M = sc.nextInt();//������ ��ġ�� ��
		int count = 0;
		int max = 0;
		
		
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();//ī�带 ���ĳ���
			
		}
		Arrays.sort(card);
		
		
			
			for(int i = 0; i < N-2; i++) {//i�� 0 1 2 3 
				for(int j = i+1; j < N-1; j++) {//j 1 2 3 4 
					for(int k = j+1; k < N; k++) {//k  2 3 4 5   
						int sum = card[i] + card[j] + card[k];//card[0] + card[1] + card[2]�� sum�� �Է�
						if(sum <= M && sum > max) max = sum;// //sum�� M���� �۰� max���� Ŭ �� max�� sum�� ����
					}
				}
				
			}
		
			System.out.print(max);

	}

}
