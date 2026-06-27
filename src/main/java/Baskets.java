import java.util.Arrays;

public class Baskets {
    public static void main(String[] args) {

        String[] goodsOfPetr = {"chicken", "bananas", "cottage cheese"};
        String[] goodsOfNikolay = {"chicken", "bananas", "cottage cheese"};
        String[] goodsOfTerentiy = {"beer", "dumplings", "laska black magic"};

        System.out.println(Arrays.toString(goodsOfPetr));
        System.out.println(Arrays.toString(goodsOfNikolay));
        System.out.println(Arrays.toString(goodsOfTerentiy));

        boolean quantityOfProductsPetrNikolay = goodsOfPetr.length == goodsOfNikolay.length;
        boolean quantityOfProductsPetrTerentiy = goodsOfPetr.length == goodsOfTerentiy.length;


        boolean compositionOfProductsPetrNikolay = Arrays.equals(goodsOfPetr, goodsOfNikolay);
        boolean compositionOfProductsPetrTerentiy = Arrays.equals(goodsOfNikolay, goodsOfTerentiy);


        System.out.println("Результат сравнения корзин Пети и Коли по количеству товаров: " + quantityOfProductsPetrNikolay);
        System.out.println("Результат сравнения корзин Пети и Терентия по количеству товаров: " + quantityOfProductsPetrTerentiy);

        System.out.println("Результат сравнения корзин Пети и Коли по составу: " + compositionOfProductsPetrNikolay);
        System.out.println("Результат сравнения корзин Пети и Терентия по составу: " + compositionOfProductsPetrTerentiy);


        String[][] allProducts = {goodsOfPetr, goodsOfNikolay, goodsOfTerentiy};

        String maxSimbols = goodsOfPetr[0];
        String minSimbols = goodsOfPetr[0];
        int totalLenght = 0;
        int numberOfElements = 0;

        for (String[] arrayOfProducts : allProducts) {                     // для каждого массива строк внутри allProducts
            for (String products : arrayOfProducts) {                      // для каждой строки внутри массива arrayOfProducts
                if (products.length() > maxSimbols.length()) {
                    maxSimbols = products;
                }
                if (products.length() < minSimbols.length()) {
                    minSimbols = products;
                }
                totalLenght += products.length();
                numberOfElements++;
            }
        }
        double averageValue = (double) (totalLenght / numberOfElements);

        System.out.println("Самое длинное название товара: " + maxSimbols);
        System.out.println("Самое короткое название товара: " + minSimbols);
        System.out.println("Среднее значение длины названия товаров: " + averageValue);
    }
}
