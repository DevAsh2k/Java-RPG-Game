public class Fighter extends Character {

    public Fighter(String characterName) {

        super(characterName, "Fighter", 150, 40, 1, 0, 0);

    }

    @Override
    public void attack(Monster monster) {

        int damage = 20;

        System.out.println();
        System.out.println(getCharacterName() + " used Sword Slash!");

        monster.takeDamage(damage);

        System.out.println(monster.getName() + " took " + damage + " damage.");

    }

    @Override
    public void specialSkill(Monster monster) {

        int manaCost = 20;
        int damage = 40;

        if (!consumeMana(manaCost)) {

            System.out.println("Not enough mana.");
            return;

        }

        System.out.println();
        System.out.println(getCharacterName() + " used Berserk Strike!");

        monster.takeDamage(damage);

        System.out.println(monster.getName() + " took " + damage + " damage.");

    }

    @Override
    public void heal() {

        int manaCost = 20;
        int healAmount = 30;

        if (!consumeMana(manaCost)) {

            System.out.println("Not enough mana.");
            return;

        }

        healHp(healAmount);

        System.out.println();
        System.out.println(getCharacterName() + " used Heal!");
        System.out.println("Recovered " + healAmount + " HP.");
        System.out.println("Current HP : " + getHp() + "/" + getMaxHp());
        System.out.println("Current Mana : " + getMana() + "/" + getMaxMana());

    }

}
