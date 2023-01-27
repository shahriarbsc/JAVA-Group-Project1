import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.


        Scanner scanner = new Scanner(System.in);

        int[] y1 = new int[2];
        int[] y2 = y1;
        int sum = 0;
        for (int i = 0; i < y1.length; i++) {
            System.out.println("Please enter a numbers");
            y2[i] = scanner.nextInt();
            System.out.println("Please enter another number");
            y1[i] = scanner.nextInt();
            sum = sum + y2[i];
            System.out.println("The sum of those numbers are " + sum);
        }
    }
}