public class Mage extends Character {

    public Mage(String characterName) {

        super(characterName, "Mage", 100, 150, 1, 0, 0);

    }

    @Override
    public void attack(Monster monster) {

        int damage = 18;

        System.out.println();
        System.out.println(getCharacterName() + " used Fireball!");

        monster.takeDamage(damage);

        System.out.println(monster.getName() + " took " + damage + " damage.");

    }

    @Override
    public void specialSkill(Monster monster) {

        int manaCost = 30;
        int damage = 50;

        if (!consumeMana(manaCost)) {

            System.out.println("Not enough mana.");
            return;

        }

        System.out.println();
        System.out.println(getCharacterName() + " used Meteor!");

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