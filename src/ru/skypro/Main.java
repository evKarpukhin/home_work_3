package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Task 1
        // 0 — iOS, 1 — Android.
        System.out.println("Task 1");
        byte clientOS;
        clientOS = 0;
        boolean isAndroid = clientOS == 1;
        if (isAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

// Task_ 2
        System.out.println();
        System.out.println("Task 2");
        int clientDeviceYear;
        int currYear = 2014;
        clientDeviceYear = 2015;

        switch (clientOS) {
            case 0: // iOS
                if (currYear < clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1: // Android
                if (currYear < clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Not supported OS!");
        }

// Task_ 3
        System.out.println();
        System.out.println("Task 3");
        int year = 2021;
        boolean highYear = ( year % 4==0 && year % 100 !=0 || year % 400==0 );
        if ( highYear )
            System.out.println(year + " год является високосным.");
        else {
            System.out.println( year + " год не является високосным.");
        }

// Task_ 4
        System.out.println();
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;

        if ( deliveryDistance <= 20 ) {
            deliveryDays++;
        } else
            if ( deliveryDistance > 20 && deliveryDistance <= 60 ) {
                deliveryDays=+2;
            } else
                if ( deliveryDistance > 60 && deliveryDistance <= 100 ) {
                    deliveryDays=+3;
                }  else  {
                    deliveryDays=+4;
                }

        System.out.println("Потребуется дней: " + deliveryDays );

// Task_ 5
        System.out.println();
        System.out.println("Task 5");
        byte monthNumber = 2;

        switch (monthNumber){
            case 12:// декабрь
            case 1: // январь
            case 2: // февраль
                System.out.println("Зима");
                break;
            case 3: // март
            case 4: // апрель
            case 5: // май
                System.out.println("Весна");
                break;
            case 6: // июнь
            case 7: // июль
            case 8: // август
                System.out.println("Лето");
                break;
            case 9: // сентябрь
            case 10: // октябрь
            case 11: // ноябрь
                System.out.println("Осень");
                break;
            default:
                System.out.println("Для месяца с номером " + monthNumber + " сезона не существует!");
        }

    } // end of main

}
