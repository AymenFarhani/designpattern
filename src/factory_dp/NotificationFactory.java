package factory_dp;

public class NotificationFactory {
    public Notification createNotification(String applicationName) {
        switch (applicationName) {
            case "Whatsup":
                return new WhatsupNotification();
            case "Linkedin":
                return new LinkedinNotification();
            case "Facebook":
                return new FacebookNotification();
            default:
                throw new IllegalArgumentException("Unknown application "+ applicationName);
        }
    }
}
