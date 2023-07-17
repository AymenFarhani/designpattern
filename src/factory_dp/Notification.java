package factory_dp;

import java.time.LocalDate;

public interface Notification {
     void notifyUser(String message, LocalDate creationDate);
}
