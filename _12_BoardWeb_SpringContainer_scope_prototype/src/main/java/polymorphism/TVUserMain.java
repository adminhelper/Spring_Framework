package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUserMain {
	public static void main(String[] args) {
		// 1. Spring Container를 구동한다
		String contextFile = "applicationContext.xml";
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext(contextFile);
		
		// 2. 기본적으로 Container는 singleton속성을 가진다
		//    계속 같은 객체이다
		//    하지만 scope를 prototype으로 주면 새로 객체가 생성된다.
		TV tv0 = (TV)factory.getBean("tv");
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		System.out.println(tv0);
		System.out.println(tv1);
		System.out.println(tv2);
		
		// 3. Spring Container 종료
		factory.close();
	}
}







