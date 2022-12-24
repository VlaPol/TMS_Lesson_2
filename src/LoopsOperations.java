import java.util.Random;
import java.util.Scanner;

public class LoopsOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = 0;

        do{

            System.out.println("\n******** МЕНЮ *********");
            System.out.println("Задача [1]  ");
            System.out.println("Задача [2] ");
            System.out.println("Задача [3] ");
            System.out.println("Задача [4] ");
            System.out.println("Задача [5] ");
            System.out.println("Задача [6] ");
            System.out.println("Задача [7] ");
            System.out.println("Выход  [0]");
            System.out.println("***********************");
            System.out.print("Ваш выбор: ");

            key = scanner.nextInt();

            switch(key){
                case 1:
                    taskOne();
                    break;
                case 2:
                    taskTwo();
                    break;
                case 3:
                    taskThree();
                    break;
                case 4:
                    taskFour();
                    break;
                case 5:
                    taskFive();
                    break;
                case 6:
                    taskSix();
                    break;
                case 7:
                    taskSeven();
                    break;
                case 0:
                    System.out.println("До новых встреч!");
                    break;
                default:
                    System.out.println("Нет такого пункта меню!");
                    break;
            }

        }while (key != 0);

    }

    private static void taskOne(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 1 ***********");
        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.\n" +
                "При решении используйте операцию инкремента (++)");
        System.out.println("***************************");

        int niceIterator = 0 ;

        for(int i = 1; i < 100; i++){
            if (niceIterator == 5){
                System.out.println("\n");
                niceIterator = 0;
            }
            if(i % 2 != 0) {
                niceIterator ++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
    private static void taskTwo(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 2 ***********");
        System.out.println("Необходимо вывести на экран числа от 5 до 1.\n" +
                "При решении используйте операцию декремента (--)");
        System.out.println("***************************");

        int iter = 5;

        while (iter > 0){
            System.out.print(iter + "\t");
            iter--;
        }
    }
    private static void taskThree(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 3 ***********");
        System.out.println("Напишите программу, где пользователь вводит любое целое положительное число. \n" +
                "А программа суммирует все числа от 1 до введенного пользователем числа.\n" +
                "Для ввода числа воспользуйтесь классом Scanner.");
        System.out.println("***************************");

        System.out.print("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Сумма от 1 до " + number + " равна " + sum);
    }
    private static void taskFour(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 4 ***********");
        System.out.println("Необходимо, чтоб программа выводила на экран вот такую последовательность:\n" +
                "   7 14 21 28 35 42 49 56 63 70 77 84 91 98.\n" +
                "В решении используйте цикл while");
        System.out.println("***************************");

        int mult = 7;
        int iterator = 1;

        while((mult * iterator) < 100){
            System.out.print(mult * iterator + "\t");
            iterator++;
        }
        System.out.println();

    }
    private static void taskFive(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 5 ***********");
        System.out.println("Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.");
        System.out.println("***************************");

        for(int i = 10; i <= 20; i++){
            System.out.println("Квадрат числа " + i + " равен " + (i*i));
        }

    }
    private static void taskSix(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 6 ***********");
        System.out.println("Написать программу, которая ищет первое число кратное 5 которое больше введенного пользователем " +
                "числа, \n" +
                "использовать в программе цикл и оператор выхода из цикла");
        System.out.println("***************************");

        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tmpNumber = number;

        while (true){

            if(number % 5 == 0){
                System.out.println("Ближайшее к "+ tmpNumber + " большее число, кратное 5 это " + number);
                break;
            }else{
                number++;
            }
        }

    }
    private static void taskSeven(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 7 ***********");
        System.out.println("Написать программу, которая создаёт массив с длинной которую вводит пользователь, " +
                "заполняет его случайными числами\n" +
                "(для генерации использовать метод Math.random()) " +
                "и выводит список значений пользователю в виде номер элемента + значение.");
        System.out.println("***************************");

        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrayDimension = scanner.nextInt();

        if(arrayDimension <= 0){
            System.out.println("Решение задачи при таком размере массива не возможно!");
            return;
        }else{
            int [] array = new int[arrayDimension];
            Random random = new Random();
            System.out.println("Создан массив:");
            System.out.println("-------------------------");
            for(int i = 0; i < arrayDimension; i++){
                array[i] = random.nextInt(100);
                System.out.println("[" + i + "]" + " = " + array[i] );
            }
            System.out.println("-------------------------");
        }



    }
}
