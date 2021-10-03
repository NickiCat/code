class Vehicle {
    int pass;
    int wheels;
    int ms;
    int bu;
    double calc_speed(double time){
        double distance = ms * time;
        return distance;
    }
}

public class Demo {
    public static void main(String[] args){
        Vehicle a1 = new Vehicle();
        Vehicle a2 = new Vehicle();
        Vehicle dist = new Vehicle();
        a1.ms = 100;
        a1.pass = 50;
        a2.ms = 180;
        a2.pass = 5;
        double time = 0.5;
        double d;
        d = a1.calc_speed(time);
        System.out.println("Bus distance " + d);
        d = a2.calc_speed(time);
        System.out.println("Car distance " + d);
    }
}
