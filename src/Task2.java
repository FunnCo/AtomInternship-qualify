import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}