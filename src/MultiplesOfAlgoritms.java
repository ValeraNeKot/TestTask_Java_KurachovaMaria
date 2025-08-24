import java.util.Scanner;

public class MultiplesOfAlgoritms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of array elements: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Elements divisible by 3:");
            for (int num : array) {
                if (num % 3 == 0) {
                    System.out.print(num + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: please enter valid numeric values");
        } finally {
            scanner.close();
        }
    }
}