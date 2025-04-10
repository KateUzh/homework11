import java.time.LocalDate;

public class Main {
    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year >= 1584;

    }

    public static void printInfoAboutVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию для iOS по ссылке");
        } else if (osType == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (osType == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (osType == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        }
        if (distance >= 20 && distance < 60) {
            return 2;
        }
        if (distance >= 60 && distance < 100) {
            return 3;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        boolean leapYear = isYearLeap(year);
        if (leapYear)
            System.out.println(year + " год високосный");
        else
            System.out.println(year + " год не високосный");

        System.out.println("\nЗадача 2");
        int osType = 0;
        int clientDeviceYear = 2020;
        printInfoAboutVersion(osType, clientDeviceYear);

        System.out.println("\nЗадача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == 1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDays == 2) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDays == 3) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");}
    }
}