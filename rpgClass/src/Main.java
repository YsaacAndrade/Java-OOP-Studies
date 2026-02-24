public class Main {
    public void main(String[] args) {
        rpgChar vlad = new rpgChar("Vladimir", 10, 4);
        rpgChar nami = new rpgChar("Nami", 5, 2);

        System.out.println(vlad.showStats());
        System.out.println(nami.showStats());

        System.out.println(nami.receiveDamage(vlad.dealDamage()));
    }
}
