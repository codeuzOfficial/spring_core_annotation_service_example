package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ProfileService profileService = (ProfileService) context.getBean("profileService");
        profileService.login("mazgi", "12345", "+998915721213");
    }
}