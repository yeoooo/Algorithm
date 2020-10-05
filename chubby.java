import java.util.Scanner;

public class chubby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] whArr = new int[N][2];//몸무게와 키를 받는 배열
		int [] rank = new int[N];
	
		
		int cRank= 0;
		
		for(int i = 0; i< N; i++) {//N명 만큼 입력 받음
			rank[i] = 1;//초기화
			whArr[i][0] = sc.nextInt();//몸무게
			whArr[i][1] = sc.nextInt();//키	
		}
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(whArr[i][0] > whArr[j][0] && whArr[i][1] > whArr[j][1]) {//하나씩 잡고 비교 몸무게와 키가 둘 다 작은 경우에
					rank[j]++;//랭크 업
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(rank[i]+" ");
		}
	}

}
