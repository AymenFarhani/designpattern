package factory_dp;

import java.time.LocalDate;

public class WhatsupNotification implements Notification{
    @Override
    public void notifyUser(String message, LocalDate creationDate) {
        System.out.println("This message is sending via Whatsup at " + creationDate
                + " : \n" + message);
    }
}
