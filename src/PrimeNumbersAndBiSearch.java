import java.util.Scanner;

public class PrimeNumbersAndBiSearch {

    private static int primesNumber = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input numbers range ");
        int range = scan.nextInt();
        System.out.println("*************************");
        int [] primeArray = eratoMethod(range);
        System.out.println("\n*************************");
        System.out.print("Input checking number: ");
        int chkNumber = scan.nextInt();
        binarySearch(primeArray,chkNumber);

    }
    static int[] eratoMethod(int dimension){

        boolean[] eratoArray = new boolean[dimension];
        int [] tmpPrimeArray = new int[dimension];

        for (int i = 2; i < dimension; i++) {
            eratoArray[i] = true;
        }
        for (int i = 2; i < dimension; i++)
            if (eratoArray[i] != false)
                for (int j = i; j*i < dimension; j++)
                    eratoArray[i*j] = false;
        for (int i = 2; i < dimension; i++) {
            if (eratoArray[i]) {
                System.out.print(" " + i);
                tmpPrimeArray[primesNumber] = i;
                primesNumber++;
            }
        }
        int [] primeArray = new int[primesNumber];

        for(int i = 0; i < primesNumber; i++){
            primeArray[i] = tmpPrimeArray[i];
        }

        return primeArray;
    }

    static private void binarySearch(int [] primeArray, int chkNumber){

        int leftPoint = 0;
        int rightPoint = primeArray.length;
        int counter = 0;

        for(int i = leftPoint; i < rightPoint; i++){

            int midPoint = leftPoint + (rightPoint-leftPoint)/2;
            counter++;

            if(primeArray[midPoint] == chkNumber) {
                System.out.println(chkNumber + " is a prime number");
                System.out.println("Find number by " + counter + " iteration");
                return;
            }
            if(primeArray[midPoint] > chkNumber){
                rightPoint = midPoint;
            }else{
                leftPoint = midPoint;
            }
        }
        System.out.println("\n" + chkNumber + " is not a prime number");
    }

}
