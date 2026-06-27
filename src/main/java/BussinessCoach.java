import java.util.Random;

public class BussinessCoach {
    public static void main (String [] args) {

        Random random = new Random();
        int ageVisitor = random.nextInt(90);
        double amountInTheAccount = random.nextDouble() * 100_000;

        boolean hasInvite = false;
        boolean inBlackList = false;

        boolean already18Years = ageVisitor >= 18;
        boolean canPresent = already18Years && (hasInvite || amountInTheAccount > 50_000) && !inBlackList;
        double voluntaryContribution = amountInTheAccount * 7.5 / 100;

        System.out.println("Возраст посетителя: " + ageVisitor);
        System.out.println("Сумма на счете (руб): " + amountInTheAccount);
        System.out.println("Допуск на мероприятие: " + canPresent);
        System.out.println("Добровольно-принудительный взнос (руб): " + voluntaryContribution);



    }
}