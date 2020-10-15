package chap07.lecture.textbook.s070201;

public class DmbCellPhone {
//필드
	
	int channel;
	
	//생성자

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번호를 바꿉니다.");
	}
	
	void turnOffDMB() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
	
}
