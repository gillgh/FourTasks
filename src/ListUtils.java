import java.util.Scanner;

public class ListUtils {
    public static void list(){
        Scanner in = new Scanner(System.in);
        int f = 0;
        boolean isValid = false;
        while(!isValid){
            System.out.println("Введите 5 значное число: ");
            f = in.nextInt();
            if(f >= 10000 && f <= 99999){
                isValid = true;
            }
            else{
                System.out.println("Вы ввели неверное число!");
            }
        }
        int ab = f/1000;
        int ba = f - (ab*1000);
        System.out.println("Первые две цифры числа: " + ab + "\n" + "Последние три цифры числа: " + ba);

    }
}
