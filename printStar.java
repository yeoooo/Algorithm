import java.util.Arrays;
import java.util.Scanner;

public class printStar {

	
	static Scanner sc = new Scanner(System.in);
	static char[][] space;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = sc.nextInt();//NÀº 3ÀÇ °ÅµìÁ¦°ö
		space = new char[N][N];
		for(int i =0; i < N; i++) {
			Arrays.fill(space[i], ' ');
		}
		starPrint(0, 0, N);//Àç±Í ½ÃÀÛ
		
		for(int i =0; i< N; i++) {
			System.out.println(space[i]);
		}
	}
	
	
	public static void starPrint(int x, int y, int k) {
		if(k == 1) {
			space[x][y] = '*';
			return;
		}
		int div = k/3;
		for(int i =0; i<3; i++) {
			for(int j =0; j <3; j++) {
				if(i % 3 == 1 && j % 3 == 1) {
					continue;
				}else {
					starPrint(x + (i * div),y + (j * div), div);
				}
			}
		}
	}
	}


