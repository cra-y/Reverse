import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse:");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println(reversed);
        scanner.close();
        }
    }
