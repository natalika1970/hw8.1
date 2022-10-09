import java.time.LocalDate;
 public class Main {
     public static void main(String[] args) {
             checkLeapYear(2022);
             getDeviceLink(0, 2005);
             int deliveryDays = calculateDeliveryDays(60);
             System.out.println("Потребуется дней " + deliveryDays);
         }

     public static void getDeviceLink(int osType, int yearVersion) {
         if (osType != 1 && osType != 0) {
             throw new IllegalArgumentException("wrong osType");
         }
         int currentYear = LocalDate.now().getYear();
         if (yearVersion > currentYear) {
             throw new IllegalArgumentException("wrong yearVersion");
         }
         String osString = osType == 0 ? "iOS" : "Android";
         String versionString = yearVersion > 2015 ? "полную" : "облегченную";
         System.out.println("установите %s версию приложения для %s по ссылке%n, versionString, osString");
     }

    public static void checkLeapYear ( int year){
         System.out.println("задание 1");
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.println(year + "год является високосным");
         } else {
             System.out.println(year + "год не является високосным");
         }
    }
//         System.out.println("задание 2");

         /*System.out.println("задание 3");*/
     public static int calculateDeliveryDays(int deliveryDistance) {
         if (deliveryDistance <= 20) {
             return 1;
         }
         else if (deliveryDistance > 20 && deliveryDistance <= 40) {
             return 2;
         }
         return 3;
     }
 }
