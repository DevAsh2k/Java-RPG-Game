public abstract class Monster {

    private String name;
    private int hp;
    private int damage;
    private int expReward;
    private int goldReward;

    public Monster(String name, int hp, int damage, int expReward, int goldReward) {

        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.expReward = expReward;
        this.goldReward = goldReward;

    }

    // -------------------------
    // Getters
    // -------------------------

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getExpReward() {
        return expReward;
    }

    public int getGoldReward() {
        return goldReward;
    } 
    // -------------------------
    // Monster Actions
    // -------------------------

    public void takeDamage(int damage) {

        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }

    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void attack(Character player);

}
