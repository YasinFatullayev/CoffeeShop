import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springmain {
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		SpringCore obj = (SpringCore) context.getBean("faizanBean");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		
//		SpringCore obj=new SpringCore();
//		obj.setName("faiznadklfas");
//		obj.getName();
	}
}