public class Dragon extends Monster {

    public Dragon() {

        super("Dragon", 200, 35, 150, 100);

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
