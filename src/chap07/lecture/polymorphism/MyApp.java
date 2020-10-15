package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindCat k1 = t1;
		// t1 = k1; 반대방향으로 할당이 안됨
		k1.cry();
		Cat c1 = new Cat();
		c1.cry();
		KindCat k2 = c1;
		k2.cry();
		//c1 = k2; 반대방향으로 할당이 안됨
		
		//c1 = t1; 반대방향으로 할당이 안됨
	}
}
