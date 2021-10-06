class ParaByRef {
    int x, y;

    ParaByRef(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void callByRef(ParaByRef o) {
        o.x = o.x + this.x;
        o.y = o.y + this.y;
    }
}

public class ParaByRefDemo {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        ParaByRef p = new ParaByRef(a, b);
        ParaByRef q = new ParaByRef(b, a);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        p.callByRef(q);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);
    }
}
