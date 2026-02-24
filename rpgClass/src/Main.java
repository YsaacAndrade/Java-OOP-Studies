import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
 /*
        System.out.print("Do You want to start the game? Yes() or No()   ");
        String start = scanner.nextLine();

        if (start.equalsIgnoreCase("no")) {
            System.out.println("Game ended!");
        }

        else {
            System.out.println("Game begins!");

            System.out.print("What's gonna be the char name? ");
            String nome = scanner.nextLine();

            System.out.print("How's much damage the char gonna cause? ");
            int damage = scanner.nextInt();

            System.out.print("How's much hp the char gonna have? ");
            int life = scanner.nextInt();
            System.out.println("\n");
*/
            Vampire player = new Vampire("vlad", 30, 10);
            Mage enemy = new Mage("Evil Wizard", 30, 10);

            //System.out.println("Your's stats are: \n" + Arrays.toString(player.showStats()) + "\n");
            //System.out.println("The enemy stats are: \n" + Arrays.toString(enemy.showStats()));

            System.out.println("\n");
            System.out.println("The combat starts!");

            System.out.println("\n");
            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("What you want to do?\n* Attack\n* run\n* show stats");
                String act = scanner.nextLine();

                if (act.equalsIgnoreCase("attack")) {
                    System.out.println("\nWhat attack?\n* Normal Attack\n* Life drain");
                    String choiceAtk = scanner.nextLine();

                    if (choiceAtk.equalsIgnoreCase("life drain")) {
                        System.out.println(player.getName() + " used life drain on " + enemy.getName());
                        System.out.println(player.getName() + " has cured by " + (player.getAttack() / 2) + " point of hp with life drain!");
                        System.out.println(enemy.receiveDamage(player.drain()) + "\n");

                        if (enemy.isAlive()) {
                            System.out.print(enemy.getName() + " used his fire ball attack!\n");
                            System.out.print(player.receiveDamage(enemy.fireBall()) + "\n");
                        }

                    }
                    else {
                        System.out.println(player.getName() + " used normal attack on " + enemy.getName() + "\n");
                        System.out.print(enemy.receiveDamage(player.dealDamage()) + "\n");

                        if (enemy.isAlive()) {
                            System.out.print(enemy.getName() + " used his fire ball attack!\n");
                            System.out.println(player.receiveDamage(enemy.fireBall()) + "\n");
                        }

                    }
                }

                else if (act.equalsIgnoreCase("run")) {
                    int runs = random.nextInt(10);

                    if (runs < 5) {
                        System.out.println("\nYou run away with success!");
                        break;
                    }
                    else {
                        System.out.println("\nYou cant run away from this combat!");
                    }
                }

                else if (act.equalsIgnoreCase("show stats\n")) {
                    System.out.println(Arrays.toString(player.showStats()));
                    System.out.println(Arrays.toString(enemy.showStats()) + "\n");
                }
            }
            if (!player.isAlive()) {
                System.out.println(enemy.getName() + " won!");
            }

            else if (!enemy.isAlive()) {
                System.out.println(player.getName() + " won!");
            }
        }
    }
