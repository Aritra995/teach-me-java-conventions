package powerpackage;

public class PowerFinder {

    private final int number;
    private final int power;

    public PowerFinder(int number, int power) {
        this.number = number;
        this.power = power;
    }

    public static int getPowerOfNumber(int number, int power) {
        int multiplier = 1;
        for (int i = 0; i<power; i++) {
            multiplier = getProduct(number, multiplier);
        }
        return multiplier;
    }

    private static int getProduct(int number, int multiplier) {
        return multiplier *= number;
    }
}
