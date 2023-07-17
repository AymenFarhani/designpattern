package adapter_dp;

public class CarSpeedMeasureInUS {

    public double getCarSpeedMilePerHour(double distance, double time) {
        return distance / time;
    }

    public void displaySpeed(double speed) {
        System.out.println("############################");
        System.out.println("This is the Old version of the application");
        System.out.println("The speed of this car is "+ speed + " Mile/h");
        System.out.println("############################");
    }
}
