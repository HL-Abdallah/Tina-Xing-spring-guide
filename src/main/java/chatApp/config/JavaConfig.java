package chatApp.config;


import chatApp.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    EmailService emailService(){
        return new EmailService();
    }

    @Bean
    @Scope("prototype")
    EmailService prototypeEmailService(){
        return new EmailService();
    }

}
