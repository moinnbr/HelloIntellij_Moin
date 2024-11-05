import java.util.Scanner;
public class HelloIntelliJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String message = scanner.nextLine();
        System.out.println(message);
        scanner.close();
    }
}

