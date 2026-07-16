public abstract class Character {

    private int hp;
    private int mana;
    private int level;
    private int exp;
    private int gold;
    private String characterName;
    private String characterClass;

    public Character (String characterName, String characterClass, int hp, int mana, int level, int exp, int gold){
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.hp = hp;
        this.mana = mana;
        this.level = level;
        this.exp = exp;
        this.gold = gold;
    }

    //Setters 
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    //Getters
    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
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

    public String getCharacterName() {
        return characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }
    
    public void viewStatus() {
        System.out.printf("%n======== Character Status ========%nName  : %s%nClass : %s%nHP    : %d%nMana  : %d%nLevel : %d%nEXP   : %d%nGold  : %d%n", characterName, characterClass, hp, mana, level, exp, gold);
    }



}
