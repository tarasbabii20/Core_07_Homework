package calendar;

import java.util.Scanner;

/**
 * Created by Taras on 09.03.2017.
 */
public class Start {

    private Scanner scanner = new Scanner(System.in);
    private Month [] months = Month.values();
    private Season [] seasons = Season.values();
    private Month month = months[0];
    private boolean exist = false;

    public void startProgram(){
        label: while(true) {
            openMenu();
            int checkMenu = scanner.nextInt();
            if(checkMenu == 1) {
                System.out.println("Введіть назву місяця:");
                String inputMonth = scanner.next();
                for (int i = 0; i < months.length; i++) {
                    if (inputMonth.equalsIgnoreCase(months[i].name())) {
                        System.out.println("Такий місяць є");
                        break;
                    } else if (months[i] == months[months.length - 1]) {
                        System.out.println("Такого місяця немає");
                    }
                }
            }
            else if(checkMenu == 2){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Всі місяці з такою ж порою року: ");
                for (int i = 0; i < months.length; i++){
                    if (month.getSeason().name().equals(months[i].getSeason().name()) && !month.name().equals(months[i].name())){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 3){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Всі місяці з такою ж кількістю днів: ");
                for (int i = 0; i < months.length; i++){
                    if (month.getDays() == months[i].getDays() && !month.name().equals(months[i].name())){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                    else if(month.name().equalsIgnoreCase("february")){
                        System.out.print("таких місяців немає");
                        break;
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 4){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Всі місяці з меншою кількістю днів: ");
                for (int i = 0; i < months.length; i++){
                    if (month.getDays() > months[i].getDays()){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                    else if(month.name().equalsIgnoreCase("february")){
                        System.out.print("таких місяців немає");
                        break;
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 5){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Всі місяці з більшою кількістю днів: ");
                for (int i = 0; i < months.length; i++){
                    if (month.getDays() < months[i].getDays()){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                    else if(month.getDays() == 31){
                        System.out.print("таких місяців немає");
                        break;
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 6){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Наступна пора року: ");
                for (int i = 0; i < seasons.length - 1; i++){
                    if (month.getSeason().equals(seasons[i])){
                        System.out.print(seasons[i + 1].name().toLowerCase() + " ");
                    }
                    else if (month.getSeason().equals(Season.AUTUMN)){
                        System.out.print(Season.WINTER.name().toLowerCase());
                        break;
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 7){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Попередня пора року: ");
                for (int i = 1; i < seasons.length; i++){
                    if (month.getSeason().equals(seasons[i])){
                        System.out.print(seasons[i - 1].name().toLowerCase() + " ");
                    }
                    else if (month.getSeason().equals(Season.WINTER)){
                        System.out.print(Season.AUTUMN.name().toLowerCase());
                        break;
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 8){
                System.out.print("Всі місяці з парною кількістю днів: ");
                for (int i = 0; i < months.length; i++){
                    if (months[i].getDays() % 2 == 0){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 9){
                System.out.print("Всі місяці з непарною кількістю днів: ");
                for (int i = 0; i < months.length; i++){
                    if (months[i].getDays() % 2 == 1){
                        System.out.print(months[i].name().toLowerCase() + " ");
                    }
                }
                System.out.println();
            }
            else if(checkMenu == 10){
                checkMonth();
                if (!exist){
                    continue label;
                }
                System.out.print("Місяць має парну кількість днів: ");
                if (month.getDays() % 2 == 0){
                    System.out.println("так");
                }
                else {
                    System.out.println("ні");
                }
            }
            else if(checkMenu == 11){
                break;
            }
        }
    }

    public void openMenu(){
        System.out.println("Введіть '1', щоб перевірити чи є такий місяць");
        System.out.println("Введіть '2', щоб вивести всі місяці з такою ж порою року");
        System.out.println("Введіть '3', щоб вивести всі місяці з такою ж кількістю днів");
        System.out.println("Введіть '4', щоб вивести всі місяці з меншою кількістю днів");
        System.out.println("Введіть '5', щоб вивести всі місяці з більшою кількістю днів");
        System.out.println("Введіть '6', щоб вивести наступну пору року");
        System.out.println("Введіть '7', щоб вивести попередню пору року");
        System.out.println("Введіть '8', щоб вивести всі місяці з парною кількістю днів");
        System.out.println("Введіть '9', щоб вивести всі місяці з непарною кількістю днів");
        System.out.println("Введіть '10', щоб вивести чи введений з консолі місяць має парну к-сть днів");
        System.out.println("Введіть '11', щоб вийти");
    }

    public void checkMonth(){
        System.out.println("Введіть назву місяця:");
        String inputMonth = scanner.next();
        for (int i = 0; i < months.length; i++){
            if (inputMonth.equalsIgnoreCase(months[i].name())) {
                month = months[i];
                exist = true;
                break;
            } else if (months[i] == months[months.length - 1]) {
                System.out.println("Такого місяця немає, спробуйте ще раз");
                exist = false;
            }
        }
    }
}
