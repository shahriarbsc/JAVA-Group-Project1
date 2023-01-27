public class Task5 {
    public static void main(String[] args) {

        int[][] variables = {{22, 31, 41, 62},
                {60, 10, 24, 42}
        };
        int totalEven = 0;
        int totalOdds = 0;


        for (int x = 0; x < variables.length; x++) {
            for (int y = 0; y < variables[x].length; y++) {
                if (variables[x][y] % 2 == 0) {
                    totalEven = totalEven + variables[x][y];
                } else {
                    totalOdds = totalOdds + variables[x][y];
                }
            }
        }
        System.out.println("The total of Even numbers is " + totalEven);
        System.out.println("The total of Odd numbers is " + totalOdds);


    }
}
