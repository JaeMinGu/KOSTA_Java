import java.util.Scanner;

/**
 * 레퍼런스 타입 배열 선언, 생성, 초기화 
 * 
 * @author 최재민
 *
 */
public class ArrayExample4 {
	public static void main(String[] args) {
//		Account account = new Account("1111-2222-3333", "최재민", 1111, 100000);
		Account[] accounts = new Account[100];
		int index = 0;
		
		
		// 은행 계좌 개설 
		accounts[index]  = new Account("1111-2222-3333", "최재민", 1111, 100000);
		index++;
		
		accounts[index]  = new Account("2222-3333-4444", "박지성", 1111, 200000);
		index++;
		
		accounts[index]  = new Account("3333-4444-5555", "손흥민", 1111, 300000);
		index++;
		
		
		// 계좌목록 출력 
		for (int i = 0; i < index; i++) {
			System.out.println(accounts[i].toString());			
		}
		
		
		// 계좌번호로 계좌조회
		String num = null;
		Scanner sc = new Scanner(System.in);			// System.in : 키보드와 관계 있음
		System.out.print("검색 계좌번호 : ");
		num = sc.nextLine();
		
		Account account = null; 
		for (int i = 0; i < index; i++) {
			if(accounts[i].getAccountNum().equals(num)) {
				account = accounts[i];
				break; 
			}
			
		}
		if(account != null) {
			System.out.println(account.toString());
			
		}else {
			System.out.println("해당하는 계좌가 없습니다.");
		}

			
		
		
		
	}
}
