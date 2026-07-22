public abstract class Character {

    private String characterName;
    private String characterClass;

    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    private int level;
    private int exp;
    private int gold;

    public Character(String characterName, String characterClass,
                     int hp, int mana, int level, int exp, int gold) {

        this.characterName = characterName;
        this.characterClass = characterClass;

        this.hp = hp;
        this.maxHp = hp;

        this.mana = mana;
        this.maxMana = mana;

        this.level = level;
        this.exp = exp;
        this.gold = gold;
    }

    // -------------------------
    // Getters
    // -------------------------

    public String getCharacterName() {
        return characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getGold() {
        return gold;
    }

    // -------------------------
    // Character Actions
    // -------------------------

    public void takeDamage(int damage) {

        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }

    }

    public void healHp(int amount) {

        hp += amount;

        if (hp > maxHp) {
            hp = maxHp;
        }

    }

    public boolean consumeMana(int amount) {

        if (mana < amount) {
            return false;
        }

        mana -= amount;
        return true;

    }

    public void restoreMana(int amount) {

        mana += amount;

        if (mana > maxMana) {
            mana = maxMana;
        }

    }

    public void gainExp(int amount) {

        exp += amount;

        while (exp >= 100) {

            exp -= 100;
            level++;

            maxHp += 20;
            hp = maxHp;

            maxMana += 10;
            mana = maxMana;

            System.out.println();
            System.out.println("************************");
            System.out.println("LEVEL UP!");
            System.out.println("Level : " + level);
            System.out.println("Max HP increased!");
            System.out.println("Max Mana increased!");
            System.out.println("************************");

        }

    }

    public void addGold(int amount) {
        gold += amount;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void viewStatus() {

        System.out.println("\n========== CHARACTER ==========");
        System.out.println("Name   : " + getCharacterName());
        System.out.println("Class  : " + getCharacterClass());
        System.out.println("HP     : " + getHp() + "/" + getMaxHp());
        System.out.println("Mana   : " + getMana() + "/" + getMaxMana());
        System.out.println("Level  : " + getLevel());
        System.out.println("EXP    : " + getExp() + "/100");
        System.out.println("Gold   : " + getGold());
        System.out.println("===============================");

    }

    // -------------------------
    // Abstract Methods
    // -------------------------

    public abstract void attack(Monster monster);

    public abstract void specialSkill(Monster monster);

    public abstract void heal();

}
