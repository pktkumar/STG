package STG.NumberCounter;

public class countHole {

    public static void main(String[] args) {

        int num = 6457819;
        int count;
        count = countHoles(num);
        System.out.println("Hello World!   " + count);

        count = counterTwo(String.valueOf(num));
        System.out.println("counter two!   " + count);

    }

    static int countHoles(int num)
    {
        int hole[] = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };
        int holes = 0;

        while (num > 0) {

            // Last digit in num
            int d = num % 10;

            // Update holes
            holes += hole[d];

            // Remove last digit
            num /= 10;
        }

        // Return the count of holes
        // in the original num
        return holes;
    }

    static int counterTwo(String num){
        int numOfHoles = 0;

        for (int i = 0; i < String.valueOf(num).length(); i++) {

            if (num.charAt(i) == '8') {
                numOfHoles += 2;
            }
            else if (num.charAt(i) == '0' || num.charAt(i) == '4' || num.charAt(i) == '6' || num.charAt(i) == '9') {
                numOfHoles++;
            }
            else
                numOfHoles +=0;
        }

        return numOfHoles;
    }


}
