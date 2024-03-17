public class Main {

    // task 1
    public static void checkYearAndPrint(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    // task 2

    public static void checkIosAndYear(int os, int clientYear) {
        int yearOfApp = 2024;

        if (os == 0){

            if (clientYear <= yearOfApp) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения для iOS по ссылке");
            }
        } else if (os == 1){

            if (clientYear <= yearOfApp){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения для Android по ссылке");
            }
        } else {
            System.out.println("Другая ОС");
        }
    }
    // task 3

    public static void checkDistance(int distance) {
        int deliveryTime = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 20 && distance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 60 && distance <= 100) {
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
        int os = 1;
        int yearIssue = 2024;
        checkIosAndYear(os, yearIssue);

        // Task 2
        int deliveryDistance = 105;
        checkDistance(deliveryDistance);


    }
}