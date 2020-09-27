import java.util.Scanner;

public class Sugar_delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //몇 kg를 배달할 건지 입력
		int Big = 5;//5 
		int Small = 3;//3kg 설탕 봉지
		int B_count= 0;
		int S_Count = 0;
	//N이 5의 배수가 아니고 3의 배수 일 때 까지 
	 
	if(N % Big == 0 && N % Small != 0 ) {//5로는 나눠떨어지지만 3으로는 나눠지지 않는 경우
		
			System.out.println(N / Big);// Big의 개수만 출력
	
	}else if(N % Small == 0 && N % Big != 0) {//3으로 나눠 떨어지지만 5로는 나눠지지 않는 경우
		System.out.println(N / Small);// Small의 개수만 출력
		
	}else {//5,3 으로 나눠 떨어지지 않는 경우 
		while(true) {
		
							//N에서 Big의 중량을 뺀 값이  Small 보다 크다면
			
			if(N - (S_Count * Small) != 0 && N - (Big * B_count) > Small ){//N이 Small로 완전히 나눠지지 않고
				B_count++;
			}
			if((N - (Big * B_count)) % 5 != 0 &&  (N - (Big * B_count)) % 3 == 0) {//N에서 Big의 중량을 뺀 값이 5의 배수는 아니고 3의 배수 일 떄
				
				
				
				N = N - (Big * B_count);//5kg 설탕 봉지의 중량을 뺀 값을 무게로 삼고
				
				if(N % Small ==0) {
					S_Count = N / Small; //3kg 설탕 봉지의 개수를 저장
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
	


