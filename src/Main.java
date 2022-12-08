import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int yearTest = 1588;
        showIsLeapYear(yearTest);

        int currentYear = LocalDate.now().getYear();
        showVersionOS(1, currentYear);

        int distanceFromBank = 99;
        int days = daysForDeliveryBankCard(distanceFromBank);
        System.out.println("доставка банковской карты составит " + days + " дн.");
    }


    private static void showIsLeapYear(int year) {
        if ((year % 400 == 0 && year != 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год " + year + " високосый");
        } else {
            System.out.println("Год " + year + " невисокосый");
        }
    }

    private static void showVersionOS (int clientDeviceOS, int clientDeviceYear) {
        int oldVersionYearRelease = 2015;
        if (clientDeviceOS == 0) {
            if (clientDeviceYear < oldVersionYearRelease) {
                System.out.println("Скачайте облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Скачайте стандартную версию для iOS по ссылке");
            }
        } else if (clientDeviceOS == 1) {
            if (clientDeviceYear < oldVersionYearRelease) {
                System.out.println("Скачайте облегченную версию для Android по ссылке");
            } else {
                System.out.println("Скачайте стандартную версию для Android по ссылке");
            }
        } else
            System.out.println("Тип операционной системы не определен, обратитесь за помощью в техническую поддержку");
    }

    private static int daysForDeliveryBankCard (int clientDistantion) {
        int daysForDelivery = 1 + (clientDistantion + 19) / 40;
        return daysForDelivery;
    }
}