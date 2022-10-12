package be.intecbrussel;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        // exerc 2.
        // Zorg dat je 10 inputs krijgt van een user en sla deze op in een array. Daarna kopieer je deze elementen
        //in een andere array in reverse order.

        // a)
        // Get 10 inputs from a user and store them in an array.

        //int[] mySecondArray = {1, 2, 3, 4 ,5 ,6 , 7 , 8 ,9 ,10};

        int[] inputArray1 = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("first number is ");
        int a = sc.nextInt();
        System.out.print("second number is ");
        int b = sc.nextInt();
        System.out.print("third number is ");
        int c = sc.nextInt();
        System.out.println("fourth number is");
        int d = sc.nextInt();
        System.out.println("fifth number is");
        int e = sc.nextInt();
        System.out.println("sixth number is");
        int f = sc.nextInt();
        System.out.println("seventh number is");
        int g = sc.nextInt();
        System.out.println("eight number is");
        int h = sc.nextInt();
        System.out.println("night number is ");
        int j = sc.nextInt();
        System.out.println("tenth number is");


        //b)
        //Then copy these elements
        //in another array in reverse order.

        int[] inputArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (
                int i = 0;
                i >= 9; i--) {
            System.out.println((i - 1) + ": input int: ");
            int value = scanner.nextInt();
            inputArray[i] = value;
        }
        System.out.println("values are:");
        for (int value : inputArray) {
            System.out.println(value);

        }
    }


}







