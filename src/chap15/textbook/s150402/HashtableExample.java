package chap15.textbook.s150402;
import java.util.*;
public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 줭!");
			System.out.println("아이디: ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).contentEquals(password)) {
					System.out.println("로그인 되었지롱~");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않지롱.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않지롱.");
			}

		}
				
	}
}
