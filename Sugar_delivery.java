import java.util.Scanner;

public class Sugar_delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //�� kg�� ����� ���� �Է�
		int Big = 5;//5 
		int Small = 3;//3kg ���� ����
		int B_count= 0;
		int S_Count = 0;
	//N�� 5�� ����� �ƴϰ� 3�� ��� �� �� ���� 
	 
	if(N % Big == 0 && N % Small != 0 ) {//5�δ� �������������� 3���δ� �������� �ʴ� ���
		
			System.out.println(N / Big);// Big�� ������ ���
	
	}else if(N % Small == 0 && N % Big != 0) {//3���� ���� ���������� 5�δ� �������� �ʴ� ���
		System.out.println(N / Small);// Small�� ������ ���
		
	}else {//5,3 ���� ���� �������� �ʴ� ��� 
		while(true) {
		
							//N���� Big�� �߷��� �� ����  Small ���� ũ�ٸ�
			
			if(N - (S_Count * Small) != 0 && N - (Big * B_count) > Small ){//N�� Small�� ������ �������� �ʰ�
				B_count++;
			}
			if((N - (Big * B_count)) % 5 != 0 &&  (N - (Big * B_count)) % 3 == 0) {//N���� Big�� �߷��� �� ���� 5�� ����� �ƴϰ� 3�� ��� �� ��
				
				
				
				N = N - (Big * B_count);//5kg ���� ������ �߷��� �� ���� ���Է� ���
				
				if(N % Small ==0) {
					S_Count = N / Small; //3kg ���� ������ ������ ����
					if(N - (S_Count * Small) == 0) {
						System.out.println(B_count + S_Count);
						break;
					}
				}else{
				System.out.println("-1");
				break;
				}
			}
				
			
		else{
			System.out.println("-1");
			
			
			break;
		}
				
			}
			
		
	
		}
		
	}	
	
		}
	


