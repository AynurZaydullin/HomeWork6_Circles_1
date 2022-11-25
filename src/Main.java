public class Main {
    public static void main(String[] args) {
        //Раздел "Циклы". Часть 1.
        System.out.println("Задание 1.");
        System.out.println();
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 2.");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 3.");
        for (int i = 0; i <= (17-1); i = i + 2){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 4.");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        //Домашнее задание - 2.
        //Задание 1.
        System.out.println("Домашнее задание - 2. Задание 1.");
        System.out.println();
        for (int year = 1904; year <= 2096; year = year + 4){
            System.out.println(year + " год является високосным.");
        }
        System.out.println();
        System.out.println();
        //Задание 2.
        System.out.println("Задание 2.");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        //Задание 3.
        System.out.println("Задание 3.");
        System.out.println("Решение первым способом.");
        for (int i = 1; i <= 512; i = i*2){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Решение вторым способом.");
        System.out.println(1);
        for (int i = 1, j = 1; i <= 9; i++){
            j = j*2;
            System.out.println(j);
        }
        System.out.println();
        System.out.println();

        //Домашнее задание - 3.
        //Задание 1.
        System.out.println("Домашнее задание - 3. Задание 1.");
        System.out.println();
        int manyInBank = 29_000;
        int totalMany = 0;
        for (int i = 1; i <=12; i++){
            totalMany = totalMany + manyInBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMany + " рублей.");
        }
        System.out.println();
        System.out.println();

        //Задание 2.
        System.out.println("Задание 2.");
        System.out.println();
        float manyInDeposit = (float) 29_000;
        float totalDepositMany = (float) 0;
        for (int i = 1; i <= 12; i++){
            totalDepositMany = totalDepositMany + totalDepositMany/100;
            totalDepositMany = totalDepositMany + manyInDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDepositMany + " рублей.");
        }
        System.out.println();
        System.out.println();

    }
}