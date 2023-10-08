import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A class for creating instances of the DataFib class
 *
 * @author Denys
 * @version 1.0
 * @see DataFib
 * @since 06.09.2023
 */

public class Main {
    /**
     * The main method that works with objects of the DataFib class
     *
     * @see DataFib#findValueOfNumberOfFib()
     * @see DataFib#checkIsLess()
     *
     * @param args comand line value
     */
    public static void main(String[] args) {
        List<DataFib> arrayOfData = new ArrayList<>();

        // Цикл для випадку взяття даних з параметру методу
       /* for(String s: args)
            arrayOfData.add(new DataFib(Integer.parseInt(s)));*/

        System.out.print("Enter the number of Fibonacci numbers: ");
        int num = enterNumber(true);

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter %s number: ", i + 1);
            arrayOfData.add(new DataFib(enterNumber(false)));
        }

        arrayOfData.forEach(DataFib::findValueOfNumberOfFib);
        System.out.print("\nFibonacci numbers: ");
        arrayOfData.forEach(x -> System.out.print(x.getValue() + " "));
        System.out.println("\n\nChecking the condition F(n+2) < 2^n");

        arrayOfData.forEach(x -> System.out.println(x.checkIsLess()));
    }

    /**
     * A method for entering data with verification for correctness
     *
     * @param includeZero check box to check whether it is in the range 0
     * @return number entered from the keyboard
     */
    public static int enterNumber(boolean includeZero) {
        int num;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            num = scanner.nextInt();

            if (num <= 0 && includeZero || num < 0) {
                System.out.println("You have entered an incorrect value! Try again!");
                continue;
            }
            return num;
        }
    }

}