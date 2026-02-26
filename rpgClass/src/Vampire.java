public class Vampire extends RpgChar{
    Vampire(String name, int life, int attack) {
        super(name, life, attack);
    }

    public int drain() {
        if (!isAlive()) {
            return 0;
        }
        else {
            receiveHeal(getAttack() / 2);
            return getAttack();
        }
    }

    public int bite() {
        if (!isAlive()) {
            return 0;
        }
        else {
            return getAttack() + 7;
        }
    }
}
