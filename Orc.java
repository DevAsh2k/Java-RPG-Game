public class Orc extends Monster {

    public Orc() {

        super("Orc", 100, 20, 70, 50);

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
