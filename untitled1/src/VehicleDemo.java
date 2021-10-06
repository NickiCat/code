class VehicleD {
    int passengers;
    int wheels;
    double max_speed;
    double burn_up;
    VehicleD() {
        passengers = 5;
        wheels = 4;
        max_speed = 90;
        burn_up = 10;
    }
    VehicleD(int passengers, int wheels, double max_speed, double burn_up) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.max_speed = max_speed;
        this.burn_up = burn_up;
    }
    void distance(double time) {
        double dist = max_speed * time;
        System.out.println(dist);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleD zhiga = new VehicleD();
        VehicleD lamba = new VehicleD(2, 4, 380, 15);
        System.out.println("Zhiga max_spped: " + zhiga.max_speed);
        System.out.println("Lamba max_spped: " + lamba.max_speed);
        double time = 0.5;
        zhiga.distance(time);
        lamba.distance(time);
    }
}
