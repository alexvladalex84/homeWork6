public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int number = 0;
        for (int i = number;i <= 10; i ++ ){
            System.out.println("Число = "+ i);
        }

        System.out.println("Задача 2");

         number = 10;
        for (int i = number;i >=0;i = i -1){
            System.out.println("Число ="+ i);
        }

        System.out.println("Задача 3");

         number = 0;
        for (int i = number; i <= 17; i= i + 2){
            System.out.println("Четное чилсо = "+i);
        }

        System.out.println("Задача 4 ");

        number = 10;
        for (int i = number; i >= -10; i = i - 1){
            System.out.println("Число = "+ i);
        }

        System.out.println("Задача 5");

        for ( int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i+" год является високосным.");
        }

        System.out.println("Задача 6");

         number = 0;
         for ( int i = number; i <= 98; i = i + 7){
             System.out.println(i);
         }

        System.out.println("Задача 7");

         number = 1;
         for (int i = number;i <= 512; i= i * 2){
             System.out.println(i);
         }

        System.out.println("Задача 8");
        int monthlyAmount = 29000;
        int total = 0;
         for ( int i = 1; i <= 12;i++){
             total = total + monthlyAmount;
             System.out.println("Месяц "+ i +",сумма накоплений " + total + " рублей.");
         }

        System.out.println("Задача 9");

         monthlyAmount = 29000;
         total = 0;
        for ( int i = 1; i <= 12;i++){
            total = total + monthlyAmount / 100;
            total = total + monthlyAmount;
            System.out.println("Месяц "+ i +",сумма накоплений " + total + " рублей.");
        }

        System.out.println("Задача 10");

        int x = 2;
        int y = 1;
        for (int i = y;i <=10;i ++){
            int result = x * i;
            System.out.println(x +"*"+i+"="+result);
        }










    }
}