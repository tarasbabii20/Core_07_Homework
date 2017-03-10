package sum;

import java.util.Scanner;

/**
 * Created by Taras on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;

        System.out.println("Введіть перше число");
        if(scanner.hasNextInt()){
            firstNum = scanner.nextInt();
        }
        else {
            System.out.println("Ви ввели не ціле число");
            System.exit(0);
        }

        System.out.println("Введіть друге число");
        if(scanner.hasNextInt()){
            secondNum = scanner.nextInt();
        }
        else {
            System.out.println("Ви ввели не ціле число");
            System.exit(0);
        }

        System.out.println("Сума двох введених чисел = " + (firstNum + secondNum));


    }
}
