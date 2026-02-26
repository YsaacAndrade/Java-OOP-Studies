public class Mage extends RpgChar{
    Mage(String name, int life, int attack) {
        super(name, life, attack);
    }

    public int fireBall() {
        if (getAttack() > 0 && !isAlive()) {
            return 0;
        } else {
            return getAttack() + 5;
        }
    }

    public int bigDrain() {
        if (!isAlive()) {
            return 0;
        }
        else {
            receiveHeal(getAttack());
            return getAttack() / 2;
        }
    }
}
