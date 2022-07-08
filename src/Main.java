import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    //Задание 1
    public static void yearIsLeap (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1() {
        yearIsLeap(2021);
    }
    //Задание 2
    public static void OsApplication (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        OsApplication(0, 2019);
    }
    //Задание 3
    public static int deliveryDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
           return days + 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
           return days + 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
           return days + 3;
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не предусмотрена");
        }
        return days;
    }
    public static void task3() {
        int result = deliveryDays(95);
        if (result > 0) {
            System.out.println("Потребуется дней: " + result);
        }
    }
}