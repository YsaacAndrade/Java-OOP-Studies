public class Main {
    public void main(String[] args) {
        rpgChar vlad = new rpgChar("Vladimir", 7, 2);
        rpgChar nami = new rpgChar("Nami", 5, 3);

        System.out.println(vlad.receiveDamage(nami.dealDamage()));
        System.out.println(nami.receiveDamage(vlad.drain()));
        System.out.println(vlad.showStats());

    }
}
