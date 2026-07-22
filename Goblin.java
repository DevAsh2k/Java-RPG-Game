public class Goblin extends Monster {

    public Goblin() {

        super("Goblin", 50, 10, 30, 20);

    }

    @Override
    public void attack(Character player) {

        System.out.println();
        System.out.println(getName() + " attacks!");

        player.takeDamage(getDamage());

        System.out.println(player.getCharacterName() + " received " +
                getDamage() + " damage.");

        System.out.println(player.getCharacterName() + " HP : "
                + player.getHp() + "/" + player.getMaxHp());

    }

}
