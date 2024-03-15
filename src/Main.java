public class Main {

    // task 1
    public static void checkYearAndPrint(int a) {
        if (a > 1584 && a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год является високосным");
        } else {
            System.out.println(a + " год не является високосным");
        }
    }
    // task 2

    public static void checkIosAndYear(int a, int b) {
        int clientDeviceYear = 2015;

        if (a == 0){

            if (b < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения для iOS по ссылке");
            }
        } else if (a == 1){

            if (b < clientDeviceYear){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения для Android по ссылке");
            }
        } else {
            System.out.println("Другая ОС");
        }
    }
    // task 3

    public static void checkDistance(int a) {
        int deliveryTime = 1;
        if (a <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (a > 20 && a <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (a > 60 && a <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else  { // для deliveryDistance > 100
            System.out.println("доставки нет.");
        }
    }



    public static void main(String[] args) {
        // Task 1
        int year = 2050;
        checkYearAndPrint(year);

        // Task 2
        int os = 0;
        int yearIssue = 2024;
        checkIosAndYear(os, yearIssue);

        // Task 2
        int deliveryDistance = 105;
        checkDistance(deliveryDistance);


    }
}