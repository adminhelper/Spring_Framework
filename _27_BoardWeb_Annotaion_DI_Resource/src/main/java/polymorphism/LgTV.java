package polymorphism;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV  implements TV{
	
	/* bean 목록중에 Speaker타입을 자동주입하려는데
	 * Speaker타입이 여러 개인 경우 오류가 발생하므로
	 * 그 타입중에 apple인 이름을 가진 타입을
	 * 주입하겠다.
	 * */	
	@Resource(name="sony")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV --- 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
