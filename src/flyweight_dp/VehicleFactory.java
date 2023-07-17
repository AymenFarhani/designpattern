package flyweight_dp;

import java.util.HashMap;

public class VehicleFactory {
    private static final HashMap<String, Car> vehicleMap = new HashMap<>();
    public static Car getCar(String type) {
        Car car = null;
        if (vehicleMap.containsKey(type)) {
            car = vehicleMap.get(type);
        } else {
            car = createNewObjectCar(type, car);
            vehicleMap.put(type, car);
            System.out.println(type + " has been created!");
        }
        return car;
    }
    private static Car createNewObjectCar(String type, Car car) {
        switch (type) {
            case "Car": {
                car = new CarImplementation();
                break;
            }
            case "Ship": {
                car = new ShipImplementation();
                break;
            }
            default: {
                System.out.println("Unreachable Code!");
            }
        }
        return car;
    }

    protected static void getNumberOfObjects(){
        System.out.println("Number of Objects is : " + vehicleMap.size());
    }
}
