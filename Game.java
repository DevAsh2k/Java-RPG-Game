import java.util.Scanner;
import java.util.Random;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private Character player;

    public void start() {

        System.out.println("==================================");
        System.out.println("        JAVA RPG GAME");
        System.out.println("==================================");

        createCharacter();

        gameMenu();

    }

    // ==========================
    // Character Creation
    // ==========================

    private void createCharacter() {

        System.out.print("\nEnter your name: ");
        String name = input.nextLine();

        while (true) {

            System.out.println("\nChoose your class");
            System.out.println("[1] Fighter");
            System.out.println("[2] Mage");
            System.out.println("[3] Marksman");

            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    player = new Fighter(name);
                    return;

                case 2:

                    player = new Mage(name);
                    return;

                case 3:

                    player = new Marksman(name);
                    return;

                default:

                    System.out.println("Invalid choice.");

            }

        }

    }

    private Monster generateMonster() {

        int randomMonster = random.nextInt(3);

        switch (randomMonster) {

            case 0:
                return new Goblin();

            case 1:
                return new Orc();

            default:
                return new Dragon();

        }

    }

    // ==========================
    // Main Menu
    // ==========================

    private void gameMenu() {

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("[1] View Status");
            System.out.println("[2] Find Monster");
            System.out.println("[3] Heal");
            System.out.println("[4] Exit");

            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    player.viewStatus();
                    break;

                case 2:

                    Monster monster = generateMonster();

                    battle(monster);

                    break;
                case 3:

                    player.heal();
                    break;

                case 4:

                    System.out.println("Thanks for playing!");
                    return;

                default:

                    System.out.println("Invalid choice.");

            }

        }

    }

    private void battle(Monster monster) {

    System.out.println();
    System.out.println("===========================");
    System.out.println("A wild " + monster.getName() + " appeared!");
    System.out.println("===========================");

    while (player.isAlive() && monster.isAlive()) {

        System.out.println();
        System.out.println("========== BATTLE ==========");
        System.out.println(player.getCharacterName() + " HP : " + player.getHp());
        System.out.println(monster.getName() + " HP : " + monster.getHp());

        System.out.println();
        System.out.println("[1] Attack");
        System.out.println("[2] Special Skill");
        System.out.println("[3] Heal");
        System.out.println("[4] Run");

        System.out.print("Choice: ");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1:

                player.attack(monster);
                break;

            case 2:

                player.specialSkill(monster);
                break;

            case 3:

                player.heal();
                break;

            case 4:

                System.out.println("You ran away!");
                return;

            default:

                System.out.println("Invalid choice.");
                continue;

        }

        if (!monster.isAlive()) {

            System.out.println();
            System.out.println(monster.getName() + " was defeated!");

            player.gainExp(monster.getExpReward());

            player.addGold(monster.getGoldReward());

            System.out.println("EXP +" + monster.getExpReward());
            System.out.println("Gold +" + monster.getGoldReward());

            return;

        }

        monster.attack(player);

        if (!player.isAlive()) {

            System.out.println();
            System.out.println("You were defeated...");
            return;

        }

    }

}



}
