public class Passwords {
    public static void main(String[] args){

        String[] passwods = {"parol", "hfTU&*^(&z", "jOhNnY!67"};

        boolean result;
        for (String pwd : passwods) {
            if (pwd.length() > 8 && pwd.charAt(0) != 1 && pwd.charAt(pwd.length() - 1) != 'z' && !pwd.contains("1234") && !pwd.contains("qwerty")) {
                result = true;
            }
            else {
                result = false;
            }
            System.out.println("пароль " + ' ' +  pwd + ' '  +  " прошел проверку: "  + result);
        }
    }
}