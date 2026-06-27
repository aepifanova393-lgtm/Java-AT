public class QAnight {

    public static void main(String[] args) {

        String[] autotests = new String[101];
        for (int i = 1; i < autotests.length; i++) {
            if (i%3 == 0 && i%5 == 0) {
                autotests[i] = "Critical!";
                System.out.println("Test #" + i + ' ' + "Critical!");
            } else if (i%5 == 0) {
                autotests[i] = "Bug";
                System.out.println("Test #" + i + ' ' + "Bug");
            } else if (i%3 == 0) {
                autotests[i] = "Flaky";
                System.out.println("Test #" + i + ' ' + "Flaky");
            } else {
                autotests[i] = "Pass";
                System.out.println("Test #" + i + ' ' + "Pass");
            }
        }

        int quantityFlaky = 0;
        int quantityBug = 0;
        int quantityCritical = 0;
        int quantityPass = 0;

        for (String priority : autotests) {
            if (priority == null) continue;

            if (priority.equals("Flaky")) {
                quantityFlaky++;
            } else if (priority.equals("Bug")) {
                quantityBug++;
            } else if (priority.equals("Critical!")) {
                quantityCritical++;
            } else if (priority.equals("Pass")) {
                quantityPass++;
            }
        }
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====\n " +
                "Всего тестов: 100\n" +
                "PASS: " + quantityPass + "\n" +
                "Flaky: " + quantityFlaky + "\n" +
                "Bug: " + quantityBug + "\n" +
                "Critical: " + quantityCritical + "\n");
    }


}