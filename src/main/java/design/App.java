package design;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Logo logo = new Logo();

        String firstSurname = logo.getRandomSurname();
        String secondSurname = logo.getFakerSurname();

        System.out.println(FigletFont.convertOneLine(firstSurname));
        System.out.println(FigletFont.convertOneLine("and"));
        System.out.println(FigletFont.convertOneLine(secondSurname));

        System.out.println(logo.getName());
        System.out.println(logo.getPhone());
        System.out.println(logo.getAddress());
    }
}
