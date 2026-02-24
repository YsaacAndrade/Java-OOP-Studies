import java.util.ArrayList;

public class rpgChar {
    private int life;
    private int attack;
    private String name;

    public void setLife(int life) {
        if (life <= 0) {
            this.life = 0;
        }
        else {
            this.life = life;
        }
    }

    public int getLife() {
        return this.life;
    }

    public ArrayList<Object> showStats() {
        ArrayList<Object> stats = new ArrayList<>();
        stats.add("Name: " + this.name);
        stats.add("Life: " + this.life);
        stats.add("Attack: " + this.attack);
        return stats;
    }

    rpgChar(String name, int life, int attack) {
        setLife(life);
        this.attack = attack;
        this.name = name;
    }

    public int dealDamage() {
        System.out.println((this.name + " has attacked and dealed " + this.attack + " as damage!"));
        return this.attack;
    }

    public String receiveDamage(int atk) {
        this.life = this.life - atk;
        if (this.life <=  0) {
            return (this.name + " has been killed!");
        }
        else {
            return ("Now " + this.name + " has " + (this.life) + " points of hp");
        }
    }

    public int drain() {
        this.life = life + this.attack/2;
        System.out.println((this.name + " has attacked and dealed " + this.attack + " as damage!"));
        System.out.println(("Vladimir has drained the blood of the enemy and has healed by " + (this.attack/2) +  "! Now he has " + this.life + " points of hp!"));
        return this.attack;
    }
}