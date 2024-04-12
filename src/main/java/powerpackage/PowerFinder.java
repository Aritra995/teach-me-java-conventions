package powerpackage;

public class PowerFinder {

    private final int num;
    private final int pow;

    public PowerFinder(int num, int pow) {
        this.num = num;
        this.pow = pow;
    }

    public static int OF(int num, int pow) {
        int p = 1;
        for (int i = 0; i<pow; i++) {
            p = getP(num, p);
        }
        return p;
    }

    private static int getP(int num, int p) {
        p *= num;
        return p;
    }
}
