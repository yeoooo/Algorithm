import java.util.Scanner;

public class Sugar_delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int small, big, count;
		
		int N = sc.nextInt();
		small =3;
		big = 5;
		int s_count = 0;
		count = 0;
		int temp = 0;
		int answer = 0;
		
		temp = N;
		
		while(true) {//(temp - (small * count)) % 5 != 0) {//5�� ����� �ƴ� ���� ��� ���ư� = 5�� ����� ������ ����
			
			
			
			if((N - (small * count)) % 5 == 0) {
				
				System.out.println(count + (temp / big));
				break;
			}
			else if((N - (small * count)) % 5 != 0 && (N - (small * count)) % 3 == 0 && (N - (small * count+1) % 5 == 0)) {
				
				answer = N / 3;
				System.out.println(answer);
				break;
			}
			else if(temp < 5 && temp != 3){
				System.out.println("-1");
				
				
				break;
		}else {
			count++;
			temp = temp -3;
		}
			
		
		}


		}
		
	}

