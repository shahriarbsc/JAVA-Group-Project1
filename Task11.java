public class Task11 {

    public static void main(String[] args) {


//Write a program to print out duplicate elements from an array of strings?


        String[] arr = {"Shah", "Pat", "Victor", "Pat", "Yuliya", "Maziar", "Rosalia", "Razzaqi", "Saud","Shah"};

        for (int x = 0; x < arr.length; x++) {
            for (int j = x + 1; j < arr.length; j++) {
                if (arr[j].equals(arr[x])) {
                    System.out.println(arr[j]);
                }
            }


        }
    }

}