import java.util.Arrays;
import java.util.Scanner;

public class Secret_message {
    public static void main(String[] args) {

        String[] message = new String[5];
        String empty = "null";
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < message.length; i++) {
            String str = sc.nextLine();

            if (str.equalsIgnoreCase(empty)) {
                str = "XX";
                System.out.println("Warning message! Часть сообщения повреждена! Используем резервный фрагмент...");

            } else {
                System.out.println("Enter is done"); //для понимания, что мы не зависли
            }
            message[i] = str;
        }

        String result = String.join(" # ", message);

        System.out.println("Итоговое сообщение: " + result);

    }
}
