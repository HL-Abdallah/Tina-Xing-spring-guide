package chatApp;

import chatApp.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonBeanScope {

    public static void runExample(){
        System.out.println("Eample using Singleton Bean Scope ..");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        EmailService emailService1 = applicationContext.getBean("emailService",EmailService.class);
        System.out.println("emailService 1 => "+emailService1);


        EmailService emailService2 = applicationContext.getBean("emailService",EmailService.class);
        System.out.println("emailService 2 => "+emailService2);

    }
}
