//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("// Task 1");

        checkLeapYear(2021);
        checkLeapYear(2024);
        checkLeapYear(1900);
        checkLeapYear(2000);

        System.out.println();
        System.out.println("// Task 2");

        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2016);

        System.out.println();
        System.out.println("// Task 3");

        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доаставка не осуществляется на такое расстояние");
        }
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }


    }

    public static void recommendAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        switch  (osType) {
            case 0:
                if (deviceYear < currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
                break;
            case 1:
                if (deviceYear < currentYear){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                }
                break;
            default:
               break;
        }


    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


}


