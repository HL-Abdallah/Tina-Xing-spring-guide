package chatApp;

import chatApp.config.JavaConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        PrototypeBeanScope.runExample();
        SingletonBeanScope.runExample();
    }
}
