import java.time.LocalDate;
import java.lang.Math;
import java.util.Random;

public class Protocols {
    static void main(String[] args) {

        dashboard();
    }

    public static String generateAccessCode() {
        int year = LocalDate.now().getYear();
        int degree = (int) Math.pow(3, 7);
        return (year + "-" + degree);

    }

    private static boolean isValidCode(String code, int minLength) {
        if (!code.equals("null") && code.length() >= minLength && code.contains("-")) {
            return true;
        } else {
            return false;
        }
    }

    public static String logEvent(String message) {
        return ("[INFO] " + message);
    }

    public static String logEvent(String message, boolean isCritical) {
        if (isCritical) {
            return ("[CRITICAL] " + message);
        } else {
            return logEvent(message);
        }
    }

    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int id = random.nextInt(1000, 9999);
        return (prefix + "-" + id);
    }

    private static void dashboard() {
        String code = generateAccessCode();
//        System.out.println(code); чтобы проверить код
        int minLength = 8;
        System.out.println("Check result: " + isValidCode(code, minLength));
        String info = logEvent("Server protection activated");
        String critical = logEvent("Intrusion attempt detected",    true);
        System.out.println(info);
        System.out.println(critical);

        String firstId = generateAgentId("AGENT", 42);
        String secondId = generateAgentId("AGENT", 77);
        String thirdId = generateAgentId("AGENT", 13);
        System.out.println(firstId + "\n" + secondId + "\n" + thirdId);

    }
}
