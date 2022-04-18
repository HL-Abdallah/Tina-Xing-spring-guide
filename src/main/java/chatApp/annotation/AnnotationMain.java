package chatApp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
//        SMSService smsService = applicationContext.getBean(SMSService.class);
//        System.out.println("smsService => "+smsService);
        System.out.println("FOUND "+applicationContext.getBeanDefinitionCount()+" BEANS ");
        for ( String bean : applicationContext.getBeanDefinitionNames()){
            System.out.println(" BEAN NAMED ==> "+bean.toString());
        }
    }
}
