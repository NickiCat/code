class Vehicle {
    int passengers;
    private int wheels; // private class for example
    int max_speed; // private class for example
    int burn_up;

    // constuctor vehicle
    Vehicle(int passengers, int wheels, int max_speed, int burn_up) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.max_speed = max_speed;
        this.burn_up = burn_up;
    }
    
    // computing distance
    double distance(double interval) {
        double val = this.max_speed * interval;
        return val;
    }

    int getMax_speed() {
        return this.max_speed;
    }
    int getWheels() {
        return this.wheels;
    }

    void setWheels(int wheels) {
        if((wheels < 1) || (wheels > 24)) {
            System.out.println("Error in count wheels");
            return;
        }
        this.wheels = wheels;
    }
}

public class VehicleAccessDemo {
    public static void main(String[] args) {
        Vehicle ferrari = new Vehicle(2, -2, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari of 0.5 hours distance = " + distance);
        ferrari.setWheels(4);
        System.out.println("Ferrari of 0.5 hours distance = " + distance + " " + ferrari.max_speed);
    }
}
