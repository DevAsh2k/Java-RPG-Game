public class Marksman extends Character {

    public Marksman(String characterName) {

        super(characterName, "Marksman", 100, 80, 1, 0, 0);

    }

    @Override
    public void attack(Monster monster) {

        int damage = 22;

        System.out.println();
        System.out.println(getCharacterName() + " used Arrow Shot!");

        monster.takeDamage(damage);

        System.out.println(monster.getName() + " took " + damage + " damage.");

    }

    @Override
    public void specialSkill(Monster monster) {

        int manaCost = 15;
        int damage = 35;

        if (!consumeMana(manaCost)) {

            System.out.println("Not enough mana.");
            return;

        }

        System.out.println();
        System.out.println(getCharacterName() + " used Rain of Arrows!");

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
