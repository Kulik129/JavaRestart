import java.util.Scanner;

public class ReadingFromTheConsole {
    public static void readingConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String out = in.nextLine();
        System.out.println("Введенная строка: "+out);

        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.println("Введенное число: "+number);
        in.close();
    }

}
