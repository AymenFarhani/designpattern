package factory_dp;

import java.time.LocalDate;

public class FacebookNotification implements Notification {
    @Override
    public void notifyUser(String message, LocalDate creationDate) {
        System.out.println("This message is sending via Facebook at " + creationDate
                + " : \n" + message);
    }
}
