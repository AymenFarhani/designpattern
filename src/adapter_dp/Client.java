package adapter_dp;

public class Client {
    private CarSpeedMeasure carSpeedMeasure;
    public void setCarSpeedMeasure(CarSpeedMeasure carSpeedMeasure) {
        this.carSpeedMeasure = carSpeedMeasure;
    }
    public void getCarSpeedPerHour(double distance, double time) {
        carSpeedMeasure.getCarSpeedPerHour(distance, time);
    }
}
