package dasturlash.uz;

import org.springframework.stereotype.Service;

@Service
public class SmsService {
    public void sendMessage(String phone, String message) {
        System.out.printf("Sending sms to phone = %s message = %s ", phone, message);
    }
}
