package chap11.String.textBook;

public class StringReplaceExample {
	public static void main(String[] args) {
		
		String oldStr = "헨리는 잘 생기고 멋집니다.. 헨리는 아들 1명을 가지고 있습니다.";
		String newStr = oldStr.replace("헨리" , "Henry");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
