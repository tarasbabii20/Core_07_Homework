package checkPalindrome;

import java.util.Scanner;

/**
 * Created by Taras on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово");
        String palindrome = scanner.nextLine();

        if(palindrome.length() == 5) {
            String reversePalindrome = new StringBuffer(palindrome).reverse().toString();
            if(palindrome.equalsIgnoreCase(reversePalindrome)){
                System.out.println("Слово, яке ви ввели є паліндромом");
            }
            else {
                System.out.println("Слово, яке ви ввели не є паліндромом");
            }
        }
        else {
            System.out.println("Ви ввели слово не з 5 букв");
        }


    }
}
