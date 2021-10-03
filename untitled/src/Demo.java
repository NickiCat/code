class Vehicle {
    int pass;
    int wheels;
    int ms;
    int bu;

    Vehicle(int pass, int wheels, int ms, int bu) {
        this.pass = pass;
        this.wheels = wheels;
        this.ms = ms;
        this.bu = bu;
    }

    double calc_speed(double time){
        double distance = ms * time;
        return distance;
    }

    void print(double time){
        System.out.println("Passengers: " + pass);
        System.out.println("Wheels: " + wheels);
        System.out.println("Max speed: " + ms);
        System.out.println("Burn up: " + bu);
        System.out.println("Distance " + calc_speed(time) + " to " + time + " hours");
    }
}

public class Demo {
    public static void main(String[] args){
        Vehicle a1 = new Vehicle(5, 4, 180, 9);
        Vehicle a2 = new Vehicle(50,4, 90, 20);
        double time = 0.5;
        double dist;
        dist = a1.calc_speed(time);
        a1.print(time);
        a2.print(time);
    }
}
