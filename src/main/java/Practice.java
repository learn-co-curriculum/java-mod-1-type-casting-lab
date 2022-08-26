public class Practice {

    private final double firstNumber = 16;
    private final double secondNumber = 2;

    /**
     * We assigned firstNumber and secondNumber two integers
     * instead of doubles. Print out the two values and see if
     * the automatic widening worked!
     */
    public void  printNumbers() {

    }

    /**
     * Take the absolute value of the square root of the
     * firstNumber and return it as an int.
     * @return int - square root of firstNumber.
     */
    public int positiveSquareRoot() {

        return 0;
    }

    /**
     * Take the firstNumber and raise it to the secondNumber.
     * Then return it as an int.
     * @return int - firstNumber raised to the secondNumber
     */
    public int square() {

        return 0;
    }

    /**
     * Take Euler's number (e) and raise it to the secondNumber.
     * Then return it as a double.
     * @return double - e raised to the secondNumber
     */
    public double eSquared() {

        return 0.0;
    }

    /**
     * Generate a random number between 0 and 1
     * and then print out its value.
     */
    public void printRandom() {

    }

    /**
     * Find the floor of the constant pi
     * and raise it to the secondNumber.
     * Print the value after raising it to the power
     * of the secondNumber as a whole number instead
     * of a fractional number.
     */
    public void printFloorSquared() {
        double pi = Math.PI;

    }

    /**
     * Take the square root of the ceiling value of pi
     * and return it as an int.
     */
    public int squareRootOfCeiling() {
        double pi = Math.PI;

        return 0;
    }

    /**
     * Find the minimum and maximum values between
     * firstNumber and secondNumber. Then print out the
     * values as Doubles.
     */
    public void printMinAndMax() {
        Double minimum;
        Double maximum;

        System.out.println("The minimum is " + minimum);
        System.out.println("The maximum is " + maximum);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        practice.printNumbers();
        System.out.println("The square root is " + practice.positiveSquareRoot());
        System.out.println("The square is " + practice.square());
        System.out.println("e squared is " + practice.eSquared());
        practice.printRandom();
        practice.printFloorSquared();
        System.out.println("The square root of the ceiling value of pi is " + practice.squareRootOfCeiling());
        practice.printMinAndMax();

    }
}
