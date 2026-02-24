import java.util.ArrayList;

public class rpgChar {
    private int life;
    private int attack;
    private String name;

    rpgChar(String name, int life, int attack) {
        this.life = life;
        this.attack = attack;
        this.name = name;
    }

    public ArrayList<Object> showStats() {
        ArrayList<Object> stats = new ArrayList<>();
        stats.add("Name: " + this.name);
        stats.add("Life: " + this.life);
        stats.add("Attack: " + this.attack);
        return stats;
    }

    public int showLife() {
        return this.life;
    }

    public int dealDamage() {
        System.out.println((this.name + " has attacked and dealed " + this.attack + " as damage!"));
        return this.attack;
    }

    public String receiveDamage(int atk) {
        return ("Now " + this.name + " has " + (this.life - atk) + " points of hp");
    }

}
