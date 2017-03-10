package checkParity;

import java.util.Scanner;

/**
 * Created by Taras on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");

        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number%2 == 0){
                System.out.println("Введене чило є парним");
            }
            else {
                System.out.println("Введене чило є непарним");
            }
        }
        else {
            System.out.println("Ви ввели не ціле число");
        }

    }
}
