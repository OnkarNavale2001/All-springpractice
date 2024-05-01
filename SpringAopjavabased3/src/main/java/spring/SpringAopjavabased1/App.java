package spring.SpringAopjavabased1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.configuration.Springconfig;
import com.demo.service.Banktransaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
		Banktransaction b = context.getBean(Banktransaction.class);
		b.upipayment();
		b.Cardpayment();
		

	}
}
