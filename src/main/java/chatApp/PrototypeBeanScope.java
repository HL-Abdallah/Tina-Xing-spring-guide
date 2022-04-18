package chatApp;

import chatApp.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeBeanScope {
    public static void runExample(){
        System.out.println("Example using Prototype Bean Scope .. ");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        EmailService emailService1 = applicationContext.getBean("prototypeEmailService",EmailService.class);
        System.out.println("emailService 1 => "+emailService1);


        EmailService emailService2 = applicationContext.getBean("prototypeEmailService",EmailService.class);
        System.out.println("emailService 2 => "+emailService2);
    }
}
