package adapter_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.setCarSpeedMeasure(new CarSpeedMeasureInEurope());
        client.getCarSpeedPerHour(280, 2.1);
        client.setCarSpeedMeasure(new SpeedAdapter());
        client.getCarSpeedPerHour(700, 4.8);
    }
}
