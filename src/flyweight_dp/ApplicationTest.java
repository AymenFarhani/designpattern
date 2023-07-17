package flyweight_dp;

public class ApplicationTest {
    private static final String[] types = {"Car", "Ship", "Ship", "Car", "Car", "Ship"};
    private static final String[] brands = {"BMW", "BMW", "Bugatti", "Bentley", "Chevrolet", "Mercedes"};
    public static void main(String[] args) {
        for (int i =0; i<brands.length; i++) {
            Car car = VehicleFactory.getCar(types[i]);
            car.assignVehicleBrand(brands[i]);
            car.build();
        }
        VehicleFactory.getNumberOfObjects();

    }
}
