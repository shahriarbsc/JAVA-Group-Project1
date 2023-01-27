public class Task9 {
    public static void main(String[] args) {

       //Maximum and minimum number in the array?


        int number[] = new int[]
                {13,24,31,1,17,37,23,91,4,19};

        int minimum=number[0];
        int maximum=number[0];

        for (int x = 1; x < number.length; x++) {
            if(number[x]>maximum){
                maximum=number[x];
            }else if(number[x]<minimum){
                minimum=number[x];
            }
        }
        System.out.println("The smallest number is "+minimum);
        System.out.println("The largest number is "+maximum);
    }

}
