import java.util.Scanner;

public class SumUtils {
    public static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        return a + b;
    }
}
