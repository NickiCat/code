class Ten {
    int x;
    Ten(int num) {
        x = num;
    }

}

public class TenDemo {
    public static void main(String[] args) {
        Ten s1 = new Ten(9);
        Ten s2 = new Ten(21);

        if (s1.x == s2.x) System.out.println("s1.x == s2.x");
        System.out.println("s1.x = " + s1.x + "\ns2.x = " + s2.x);
    }
}
