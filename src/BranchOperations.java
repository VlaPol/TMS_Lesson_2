import java.io.IOException;
import java.util.Scanner;

public class BranchOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = 0;

        do{

            System.out.println("\n******** МЕНЮ *********");
            System.out.println("Задача [1]  ");
            System.out.println("Задача [2] ");
            System.out.println("Задача [3] ");
            System.out.println("Задача [4] ");
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
        System.out.println("\n\n\n\n********* ЗАДАНИЕ 1 ***********");
        System.out.println("Написать программу для вывода названия поры года по номеру месяца.\n" +
                "При решении используйте оператор switch-case");
        System.out.println("***************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого номера месяца!");
                break;
        }

    }

    private static void taskTwo(){
        System.out.println("\n\n\n\n********* ЗАДАНИЕ 2 ***********");
        System.out.println("Написать программу для вывода названия поры года по номеру месяца.\n" +
                "При решении используйте оператор if-else-if");
        System.out.println("***************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
            System.out.println("Зима");
        }else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            System.out.println("Весна");
        }else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
            System.out.println("Лето");
        }else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
            System.out.println("Осень");
        }else {
            System.out.println("Нет такого номера месяца!");
        }

    }

    private static void taskThree(){
        System.out.println("\n\n\n\n********* ЗАДАНИЕ 3 ***********");
        System.out.println("Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.\n" +
                "Для определения четности числа используйте операцию получения остатка от деления ('% 2')");
        System.out.println("***************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число, не равное 0: ");
        int number = scan.nextInt();
        System.out.println("*************************");

        if(number % 2 == 0){
            System.out.println("Введенное число " + number + " - ЧЕТНОЕ");
        }else{
            System.out.println("Введенное число " + number + " - НЕ ЧЕТНОЕ");
        }
    }

    private static void taskFour(){
        System.out.println("\n\n\n\n********* ЗАДАНИЕ 3 ***********");
        System.out.println("Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Тепло».\n" +
                "Если –5>= t > –20, то вывести «Нормально». Если –20>= t, то вывести «Холодно».");
        System.out.println("***************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текущую температуру: ");
        int temperature = scan.nextInt();

        if(temperature > -5){
            System.out.println("ТЕПЛО");
        }else if(temperature > -20 && temperature <= -5){
            System.out.println("НОРМАЛЬНО");
        }else if(temperature <= -20){
            System.out.println("ХОЛОДНО");
        }
    }

}
