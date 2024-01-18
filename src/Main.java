import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int average;
        int max = 0;
        int min = 0;
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 99) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
            for (int j = 0; j < dataPoints.length; j++) {
                sum += dataPoints[j];
                min = dataPoints[1];
                if (dataPoints[j] > max) {
                    max = dataPoints[j];
                } else if (dataPoints[j] < min) {
                    min = dataPoints[j];

                }

            }

        }
        average = sum / 100;
        System.out.println("\nThe average is: " + average);
        System.out.println(" The max is: " + max);
        System.out.println(" The min is: " + min);
        System.out.println(" The sum is: " + sum);


//-------------------------------------------------------------------

        int count = 0;
        int secondCount = 0;
        Scanner scan = new Scanner(System.in);
        int userInt = InputHelper.getRangedInt(scan, "Enter a int 1-100: ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (userInt == dataPoints[i]) {
                count++;
            }
        }
        System.out.println("Your value was found " + count + " times in the array.");

        int val = InputHelper.getRangedInt(scan, " Enter a int 1-100: ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (userInt == dataPoints[i]) {
                secondCount++;
                System.out.println("The value was found at array index position: " + secondCount + 1);
                break;
            }
            }
        if (secondCount == 0) {
            System.out.println("Your value was not found in the array.");
        }
    }
    //-------------------------------------------------------------------

    public static int min(int values[]) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
    }

    public static int max(int values[]) {
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                values[i] = max;
            }
        }

        return max;
    }

    public static int occurenceScan(int values[], int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (target == values[i]) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    public static boolean contains(int values[], int target) {
        boolean x = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                x = true;
            }
        }
        return x;
    }
}
