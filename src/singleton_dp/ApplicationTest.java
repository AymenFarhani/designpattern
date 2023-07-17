package singleton_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Singleton singletonObject = Singleton.getInstance();
        singletonObject.displayMessage();
    }
}
