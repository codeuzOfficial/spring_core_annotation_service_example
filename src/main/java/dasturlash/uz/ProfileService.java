package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private SmsService smsService;

    public void login(String login, String password, String phone) {
        System.out.printf("\nLogin process with login = %s and password = %s ", login, password);
        smsService.sendMessage(phone, "Welocome to dasturlash.uz");
    }
}
