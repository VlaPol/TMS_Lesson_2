import java.util.Scanner;

public class EvenPrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number more than 0: ");
        int number = scan.nextInt();
        System.out.println("*************************");

        if(number >= 0 && number % 2 == 0){
            printer(number);
        }else if( number > 0 && number % 2 != 0){
            number--;
            printer(number);
        }else{
            System.out.println("Incorrect number!!! " + number + " is less than 0");
        }
    }
    private static void printer(int number){
        while(number >= 0){
            System.out.print(number + "\t");
            number-=2;
        }
    }
}
