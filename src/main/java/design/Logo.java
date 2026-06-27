package design;

import net.datafaker.Faker;

import java.util.Random;

public class Logo {
    private String[] surnames = {"Addams", "Frankenstein", "Jakyll", "Harker"};

    Random random = new Random();
    Faker faker = new Faker();

    public String getRandomSurname() {
        int index = random.nextInt(0, surnames.length);
        return surnames[index];
    }

    public String getFakerSurname() {
        return faker.name().lastName();
    }

    public String getName() {
        return faker.name().name();
    }

    public String getPhone() {
        return faker.phoneNumber().phoneNumber();
    }

    public String getAddress() {
        return faker.address().fullAddress();
    }


}
