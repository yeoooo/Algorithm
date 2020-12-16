import java.util.Scanner;

public class recursion_hanoi {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//입력받을 원판의 수 & 첫번째 기둥에 남아있을 원판의 수
		sb.append((int) (Math.pow(2,  n) - 1)).append("\n"); //하노이의 탑 일반 공식 2^n-1
		disc(n, 1, 2, 3);
		System.out.println(sb);
		
	}

	
	
	public static void disc(int n, int start, int medium, int dest) {//원판의 수, 기둥 세 개
	
		if(n == 1) {
			sb.append(start + " " + dest+"\n");
			return;
		}
		disc(n - 1, start, dest, medium);//n-1번 만큼 1번째 기둥에서 2번째 기둥으로
		sb.append(start + " " + dest + "\n");//제일 큰 원판을 3번째 기둥으로
		disc(n - 1, medium, start, dest);//옮겼던 n-1번 만큼 2번째 기둥에서 3번째 기둥으로
	}
}

