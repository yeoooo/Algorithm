import java.util.Scanner;

public class chubby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] whArr = new int[N][2];//�����Կ� Ű�� �޴� �迭
		int [] rank = new int[N];
	
		
		int cRank= 0;
		
		for(int i = 0; i< N; i++) {//N�� ��ŭ �Է� ����
			rank[i] = 1;//�ʱ�ȭ
			whArr[i][0] = sc.nextInt();//������
			whArr[i][1] = sc.nextInt();//Ű	
		}
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(whArr[i][0] > whArr[j][0] && whArr[i][1] > whArr[j][1]) {//�ϳ��� ��� �� �����Կ� Ű�� �� �� ���� ��쿡
					rank[j]++;//��ũ ��
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(rank[i]+" ");
		}
	}

}
