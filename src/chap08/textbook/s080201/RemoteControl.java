package chap08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // public static final 생략 가능
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	public default void setMute(boolean mute) { //public 생략 가능
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해체합니다.");
		}
	}


	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}