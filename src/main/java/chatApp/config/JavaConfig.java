package chatApp.config;


import chatApp.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    EmailService emailService(){
        return new EmailService();
    }
}
