import java.text.DecimalFormat;
import java.util.Scanner;

public class HighLevelTasks {
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
        System.out.println("\n\n\n********* ЗАДАНИЕ 1 ***********");
        System.out.println("Выведите на экран первые 11 членов последовательности Фибоначчи.");
        System.out.println("***************************");

        int firstNumber = 0;
        int secondNumber = 1;
        int counter = 0;
        int fiboNumber = 0;

        System.out.println("Первые 11 чисел ряда Фибоначчи");

        System.out.print(firstNumber + "\t" + secondNumber + "\t");

        while (counter < 9){
            fiboNumber = firstNumber + secondNumber;
            System.out.print(fiboNumber + " \t");
            firstNumber = secondNumber;
            secondNumber = fiboNumber;
            counter++;
        }
        System.out.println();
    }
    private static void taskTwo(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 2 ***********");
        System.out.println("За каждый месяц банк начисляет к сумме вклада 7% от суммы. \n" +
                "Напишите программу, в которую пользователь вводит сумму вклада и\n" +
                "количество месяцев. А банк вычисляет конечную сумму вклада с учетом\n" +
                "начисления процентов за каждый месяц.\n" +
                "Для вычисления суммы с учетом процентов используйте цикл for. Пусть\n" +
                "сумма вклада будет представлять тип float.");
        System.out.println("***************************");

        System.out.print("Введите сумму вклада: ");
        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        DecimalFormat formatter = new DecimalFormat("##.00");
        float currentDeposit = deposit;
        final float percent = 0.07f;

        for(int i = 1; i <= month; i++){
            currentDeposit = currentDeposit + (currentDeposit * percent);
        }

        System.out.println("Через " + month + " месяцев вклад составит " + formatter.format(currentDeposit));
    }
    private static void taskThree(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 3 ***********");
        System.out.println("Напишите программу, которая выводит на консоль таблицу умножения.");
        System.out.println("***************************");

        for(int i = 0; i <= 9; i++){
            if(i == 0){
                System.out.print("\t");
                continue;
            }
            System.out.print("[" + i + "]" + "\t");
        }
        System.out.println();
        for(int i = 1; i <= 9; i++){
            System.out.print("[" + i + "]" + "\t");
            for(int j = 1; j <= 9; j++){
                  System.out.print(i*j + "\t");
            }
            System.out.println();
        }

    }
    private static void taskFour(){
        System.out.println("\n\n\n********* ЗАДАНИЕ 4 ***********");
        System.out.println("Вся сумма долга разбивается на равные платежи. \n" +
                "Первые три месяца проценты не начисляются. \n" +
                "Каждый месяц проценты когда проценты начисляются, они начисляются от суммы невыплаченной задолженности \n" +
                "(в четвертый месяц - от всей суммы - 3 месячных платежа, в последний - от единоразового платежа). \n" +
                "Необходимо вывести пользователю информацию по каждому месяцу:\n" +
                "номер месяца + сумма платежа + проценты + итоговый месячный платёж. В конце - сумма всех платежей с учётом процентов.");
        System.out.println("***************************");

        System.out.print("Введите сумму задолженности: ");
        Scanner scanner = new Scanner(System.in);
        float credit = scanner.nextFloat();
        System.out.print("Введите количество месяцев на погашение: ");
        scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        DecimalFormat formatter = new DecimalFormat("##.00");
        double percent = 0.0;
        double curPercent = 0.07;
        double curDebet = credit;
        float payment = credit/month;


        for(int i = 1; i <= month; i++){
            if(i == 1 || i == 2 || i == 3){
                curDebet = curDebet - payment;
                System.out.println("Месяц [" + i +"] : Сумма платежа " + formatter.format(payment) +
                        " Процент по платежу " + percent + ". Итого в текущем месяце оплатить " + formatter.format(payment));
            }else{
                percent = (credit - curDebet) * curPercent;
                System.out.println("Месяц [" + i +"] : Сумма платежа " + formatter.format(payment) +
                        " Процент по платежу " + formatter.format(percent) + ". Итого в текущем месяце оплатить " + formatter.format(payment+percent));

            }
        }


    }
}
