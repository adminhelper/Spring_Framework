package collectionbean;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionList bean = (CollectionList)
				factory.getBean("collectionList");
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		factory.close();
	}
}









