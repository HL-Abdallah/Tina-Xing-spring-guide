package chatApp.annotation;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService {

    public void sendSMS(String reciever , String message ){
        System.out.println("Sending ===>  '"+message+"' TO ===> "+reciever);
    }

}
