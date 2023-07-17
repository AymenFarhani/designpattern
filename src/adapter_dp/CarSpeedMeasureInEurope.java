package adapter_dp;

public class CarSpeedMeasureInEurope implements CarSpeedMeasure {
    @Override
    public void getCarSpeedPerHour(double distance, double time) {
        System.out.println("############################");
        System.out.println("This is the new version of the application");
        double speedPerHour = distance/time;
        System.out.println("The speed of this car is "+ speedPerHour + " km/h");
        System.out.println("############################");
    }
}
