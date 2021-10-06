class Vehicle {
    int passengers;
    int wheels;
    private int max_speed;
    int burn_up;

    // constuctor vehicle
    Vehicle(int passengers, int wheels, int max_speed, int burn_up) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.max_speed = max_speed;
        this.burn_up = burn_up;
    }
    
    // computing distance
    double distance(double interval) {
        double val = this.max_speed * interval;
        return val;
    }
}

public class VehicleAccessDemo {
    public static void main(String[] args) {
        Vehicle ferrari = new Vehicle(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari of 0.5 hours distance = " + distance);
    }
}
