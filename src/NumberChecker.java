import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number greater then 7: ");
            int number = scanner.nextInt();

            if (number <= 7){
                System.out.println("Bye");
            }

            if (number > 7) {
                System.out.println("Hello");
            }
        } catch (Exception e) {
            System.out.println("Error! Please retry");
        } finally {
            scanner.close();
        }
    }
}