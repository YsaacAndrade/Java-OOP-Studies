public class RpgChar {
    private int life;
    private int attack;
    private String name;

    private void setLife(int life) {
        if (life <= 0) {
            this.life = 0;
        }
        else {
            this.life = life;
        }
    }

    private void setAttack(int attack) {
        if (attack <= 0) {
            this.attack = 0;
        }
        else {
            this.attack = attack;
        }
    }

    private void setName(String name) {
        if (name.isBlank()) {
            this.name = "Player";
        }
        else {
            this.name = name;
        }
    }

    public boolean isAlive() {
        if (this.life == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public int getLife() {
        return this.life;
    }

    public int getAttack() {
        return this.attack;
    }

    public String getName() {
        return this.name;
    }

    public String[] showStats() {
        return new String[]{("Name: " + this.name), ("Life: " + this.life), ("Attack: " + this.attack)};
    }

    RpgChar(String name, int life, int attack) {
        setLife(life);
        setAttack(attack);
        setName(name);
    }

    public int dealDamage() {
        if (!isAlive()) {
            return 0;
        }
        else {
            return this.attack;
        }
    }

    public String receiveDamage(int atk) {
        if (atk < 0) {
            return "You can't receive negative values as damage!";
        }
        else if (!isAlive()) {
            return "You can't receive damage, you're dead!";
        }
        else {
        setLife(this.life - atk);
        if (!isAlive()) {
            return (this.name + " has been killed!");
        }
        else {
            return ("Now " + this.name + " has " + (this.life) + " points of hp");
        }
        }
    }

    public void receiveHeal(int quantity) {
        if (!isAlive()) {
            this.life = 0;
        }
        else {
            this.life += quantity;
        }
    }
}

// I HATE BOLETOS