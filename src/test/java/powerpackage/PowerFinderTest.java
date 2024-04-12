package powerpackage;

import org.junit.Test;

public class PowerFinderTest {

    @Test
    public void oneRaisedToOneIsOne() {
        PowerFinder powerfinder = new PowerFinder(1, 1);
        int powerOfOne = powerfinder.OF(1, 1);
        assert powerOfOne == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        PowerFinder powerFinder = new PowerFinder(2, 1);
        int powerOfTwo = powerFinder.OF(2, 1);
        assert powerOfTwo == 2;
    }

    @Test
    public void twoPowerFourIsSixteen() {
        PowerFinder powerFinder = new PowerFinder(2, 4);
        int powerOfTwo = powerFinder.OF(2, 4);
        assert powerOfTwo == 16;
    }

    @Test
    public void twoPowerThreeIsEight() {
        PowerFinder powerFinder = new PowerFinder(2, 3);
        int powerOfThree = powerFinder.OF(2, 3);
        assert powerOfThree == 8;
    }
}
