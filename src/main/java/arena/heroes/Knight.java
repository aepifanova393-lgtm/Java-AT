package arena.heroes;

public class Knight extends Hero {
    private int armor;

    public Knight(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
    }

    @Override
    public String toString() {
        return super.toString() +
                " броня: " + armor;
    }

//    @Override
//    public final void rest() {
//        System.out.println("Рыцарь тусит в таверне и пьет пиво!");
//    }
}
