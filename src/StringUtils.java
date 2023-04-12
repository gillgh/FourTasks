import java.util.Scanner;

public class StringUtils {
    public static String intToString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int c = in.nextInt();
        return Integer.toString(c);
    }
}
