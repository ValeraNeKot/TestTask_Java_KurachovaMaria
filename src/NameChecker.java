import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            if ("John".equals(name)) {
                System.out.println("Hello, John");
            } else {
                System.out.println("There is no such name");
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            scanner.close();
        }
    }
}