public class Main {
    public static void main(String[] args) {
        Prey deer = new Prey();
        Hunter wolf = new Hunter();

        wolf.run();
        deer.run();
    }
}
