public class Task10 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int [] numbers = {22, 10, 7, 50, 12};

        int largest = 0;
        int secondLargest = 0;

        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] > largest) {
                secondLargest = largest;
                largest = numbers[x];
            } else if (numbers[x] > secondLargest) {
                secondLargest = numbers [x];
            }
        }
        System.out.println("The second largest number is "+secondLargest);
    }



}

