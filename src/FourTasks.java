import java.util.Scanner;

public class FourTasks {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String [] args){

        System.out.println("Сумма равна: " + sum());
        System.out.println("Число пробразованно: " + intToString());
        list();
        System.out.println("Число в int значении: " + stringToInt());

    }

    private static int sum() {
        System.out.println("Введите два числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        return a + b;
    }

    private static String intToString(){
        System.out.println("Введите число: ");
        int c = in.nextInt();
        return Integer.toString(c);
    }

    private static void list(){
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

    private static int stringToInt(){
        String str = "31111";
        int j;
        return Integer.parseInt(str);
    }


}


