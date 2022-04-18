package chatApp;

import chatApp.config.JavaConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TypesOfApplicationContexts {
    public static void runExample(){

        // this is old way, tightly coupled !
        EmailService emailService = new EmailService();

        // using IOC:
        // example using XmlBeanFactory() which is deprecated :(
        BeanFactory beanFactory0 = new XmlBeanFactory(new ClassPathResource("spring.xml"));

        // or using ClassPathXmlApplicationContext ( not very popular, can do it tho )
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        // using either classpath or fileSystemXml
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml"); // this on depends on the classPath
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("src\\main\\resources\\spring.xml"); // independant from class path, can be in any folder.

        // using java config class , the new COOOL way !
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}
