package polymorphism;

/* interface를 통해 결합도(Coupling)를
 * 낮춘다.
 * 
 * 디자인 패턴중에 Factory Pattern을 사용하여
 * 느슨한 결합을 적용한다
 */
public class TVUserMain {
/*	
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean("bitcamp");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();		
	}
*/
	static BeanFactory factory = new BeanFactory();
	
	public static void ViewTV(String beanName) {		
		TV tv = (TV)factory.getBean(beanName);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();		
	}
	
	public static void main(String[] args) {
		
		factory.regBean("samsung", "polymorphism.SamsungTV");
		factory.regBean("lg", "polymorphism.LgTV");
		factory.regBean("bitcamp", "polymorphism.BitTV");
		
		ViewTV("samsung");
		ViewTV("lg");
		ViewTV("bitcamp");	
	}
}







