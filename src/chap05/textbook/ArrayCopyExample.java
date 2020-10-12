package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy" };
		String[] newstrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newstrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newstrArray.length; i++) {
			System.out.println(newstrArray[i] + ", ");
		}
	}
}
