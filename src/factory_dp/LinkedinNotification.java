package factory_dp;

import java.time.LocalDate;

public class LinkedinNotification implements Notification{
    @Override
    public void notifyUser(String message, LocalDate creationDate) {
        System.out.println("This message is sending via Linkedin at " + creationDate
                + " : \n" + message);
    }
}
