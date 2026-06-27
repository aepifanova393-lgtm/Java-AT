package arena.heroes;

public class Hero {
    private String name;
    private int level;
    private int health;
    static final int MAX_LEVEL = 100;
    static int heroesCreated;


    //методы и конструкторы

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;

        heroesCreated++;
    }

    public void printInfo() {
        System.out.printf("Имя героя: %s, Уровень героя: %d, Текущее здоровье: %d, \n", name, level, health);
    }

    public void takeDamage(int damage) {
        health-=damage;
        if(health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        level++;
        if(level > MAX_LEVEL) {
            level = MAX_LEVEL;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой атакует цель" + " " + target + " " + times + " " + "раз");
    }


    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

    @Override
    public String toString() {
        return "Имя героя: " + name + " " + "Уровень героя: " + level + " " + "Здоровье героя: " + health;
    }
}