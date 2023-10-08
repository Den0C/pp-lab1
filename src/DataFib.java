/**
 * A class that contains data about the number and value of the Fibonacci number,
 * data access methods and other methods
 *
 * @author Denys
 * @version 1.0
 * @since 06.09.2023
 */


public class DataFib {
    /**
     * Number Fibonacci
     */
    private int numberFibonacci;

    /**
     * Value Fibonacci
     */
    private int value;

    /**
     * Number n+2 Fibonacci
     */
    private int numberForCheck;

    /**
     * Constructor for setting data
     *
     * @param numberFibonacci Fibonacci number
     */
    public DataFib(int numberFibonacci) {
        this.numberFibonacci = numberFibonacci;
    }

    /**
     * A method for recording the Fibonacci number
     *
     * @param numberFibonacci Fibonacci number
     */

    public void setNumberFibonacci(int numberFibonacci) {
        this.numberFibonacci = numberFibonacci;
    }

    /**
     * A method for obtaining the Fibonacci number
     *
     * @return Fibonacci number
     */
    public int getValue() {
        return value;
    }

    /**
     * A method for obtaining the Fibonacci number
     *
     * @return Fibonacci number
     */
    public int getNumberFibonacci() {
        return numberFibonacci;
    }

    /**
     * A method for finding the value of the Fibonacci number
     */

    public void findValueOfNumberOfFib() {
        int firstNum = 0;
        int startedNum = 1;
        int res = 0;

        for (int i = 0; i < numberFibonacci + 2; i++) {
            res = startedNum + firstNum;

            startedNum = firstNum;
            firstNum = res;

            if (i == numberFibonacci - 1)
                value = res;

        }

        numberForCheck = res;
    }

    /**
     * A method for checking whether the condition is satisfied
     *
     * @return true or false
     */
    public boolean checkIsLess() {
        double num = Math.pow(2, numberFibonacci);
        System.out.print("n = " + numberFibonacci + "  |  F(n) = " + value + "  |  F(n+2) = " + numberForCheck + "  |  2^n = " + num + " |  F(n+2) < 2^n = ");
        return value < num;
    }
}
