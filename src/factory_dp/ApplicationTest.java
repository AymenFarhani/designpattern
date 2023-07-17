package factory_dp;

import java.time.LocalDate;

public class ApplicationTest {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification linkedinNotification = notificationFactory.createNotification("Linkedin");
        linkedinNotification.notifyUser("A new connection request has been sent to you!", LocalDate.now());
    }
}


