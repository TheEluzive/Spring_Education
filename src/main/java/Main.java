import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext classPathXMLContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		TestBean testBean=classPathXMLContext.getBean("testBean", TestBean.class);
		System.out.println(testBean.toString());
		classPathXMLContext.close();
	}
}
