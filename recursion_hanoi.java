import java.util.Scanner;

public class recursion_hanoi {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//�Է¹��� ������ �� & ù��° ��տ� �������� ������ ��
		sb.append((int) (Math.pow(2,  n) - 1)).append("\n"); //�ϳ����� ž �Ϲ� ���� 2^n-1
		disc(n, 1, 2, 3);
		System.out.println(sb);
		
	}

	
	
	public static void disc(int n, int start, int medium, int dest) {//������ ��, ��� �� ��
	
		if(n == 1) {
			sb.append(start + " " + dest+"\n");
			return;
		}
		disc(n - 1, start, dest, medium);//n-1�� ��ŭ 1��° ��տ��� 2��° �������
		sb.append(start + " " + dest + "\n");//���� ū ������ 3��° �������
		disc(n - 1, medium, start, dest);//�Ű�� n-1�� ��ŭ 2��° ��տ��� 3��° �������
	}
}

