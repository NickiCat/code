class ParaByValue {
    int x;
    int y;

    ParaByValue(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void callByVal() {
        x += y;
        y++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class ParaByValueDemo {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        ParaByValue test = new ParaByValue(a, b);
        test.callByVal();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
