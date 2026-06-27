package arena;

import arena.heroes.Archer;
import arena.heroes.Hero;
import arena.heroes.Knight;
import arena.heroes.Mage;

public class App {

    public static void main(String[] args) {
        Knight knight = new Knight("Arthur", 10, 100, 50);
        Archer archer = new Archer("Robin", 8, 80, 30);
        Mage mage = new Mage("Merlin", 12, 60, 200);

        Hero.printHeroesCreated();

        Hero[] heroes = {knight, archer, mage};

        for(Hero h : heroes) {
            h.printInfo();
            h.attack();
        }

        final Knight knightF = new Knight("Lancelot", 10, 100, 50);

        System.out.println(knightF);

        knightF.takeDamage(30);

        System.out.println(knightF);
    }
}
