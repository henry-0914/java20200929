package chap11.String;

public class StringEX1 {
	public static void main(String[] args) {
		
		String str1 = "java";
		// 속성과 기능이 있음
		str1.charAt(2);
		char c1 = str1.charAt(0);
		System.out.println(c1);

		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		
		//equals
		
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		System.out.println(str2.equals (str6));
		
		// indexOf
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf ("프로");
		System.out.println(a);
		
		// length
		String str8 = "이것이 자바다.";
		int l = str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l -1));
		
		// replace : 대체
		
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
		
		//substring : 부분적으로 뽑아냄
		
		String str11 = "0123456789";
		String sub = str11.substring(2, 3); // 마지막 자리는 제외함
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		sub = str11.substring(6);
		System.out.println(sub);
		
		// trim : 앞,뒤공백 제거(중간 공백은 제가 못함)
		String str12 = "   java";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
	}
}
