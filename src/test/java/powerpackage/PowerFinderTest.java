package powerpackage;

import org.junit.Test;

public class PowerFinderTest {

    @Test
    public void shouldReturnOneWhenOneIsRaisedToOne() {
        PowerFinder powerfinder = new PowerFinder(1, 1);
        int powerOfOne = powerfinder.getPowerOfNumber(1, 1);
        assert powerOfOne == 1;
    }

    @Test
    public void shouldReturnTwoWhenTwoIsRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder(2, 1);
        int powerOfTwo = powerFinder.getPowerOfNumber(2, 1);
        assert powerOfTwo == 2;
    }

    @Test
    public void shouldReturnSixteenWhenTwoIsRaisedToFour() {
        PowerFinder powerFinder = new PowerFinder(2, 4);
        int powerOfTwo = powerFinder.getPowerOfNumber(2, 4);
        assert powerOfTwo == 16;
    }

    @Test
    public void shouldReturnEightWhenTwoIsRaisedToThree() {
        PowerFinder powerFinder = new PowerFinder(2, 3);
        int powerOfThree = powerFinder.getPowerOfNumber(2, 3);
        assert powerOfThree == 8;
    }
}
