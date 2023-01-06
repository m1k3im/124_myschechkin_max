package task;

public abstract class BattleUnitBase implements BattleUnit {
    /*
     *   Конструктор:
     *       - принимающий в качестве параметров имя, макс. здоровье, базо-
     *         вую силу, макс. броню.
     *   Абстрактные методы:
     *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
     *       void attack(BattleUnit other)
     *   Дополнительно:
     *       - все остальные методы должны быть реализованы
     *       - минимальный уровень здоровья - 0
     *       - минимальный уровень брони - 0
     *       - здоровье и броня ни в какой момент не могут быть больше
     *         максимального уровня
     * ---------------------------------------------------------------------
     */
    protected String charName;
    protected  int maxHealth;
    protected  int baseStrength;
    protected  int maxArmor;
    protected  int Health;
    protected  int Strength;
    protected  int Armor;





    public BattleUnitBase(String charName, int maxHealth, int baseStrength, int maxArmor) {
        this.charName = charName;
        this.Health = this.maxHealth = maxHealth;
        this.Strength = this.baseStrength = baseStrength;
        this.Armor = this.maxArmor = maxArmor;
    }

    @Override
    public String name() {
        return this.charName;
    }

    @Override
    public int health() {
        return this.Health;
    }

    @Override
    public int maxHealth() {
        return this.maxHealth;
    }

    @Override
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        this.Health = Math.min(this.Health, this.maxHealth);
    }

    @Override
    public void heal(int value) {
        this.Health = Math.max(Math.min(this.health() + value, this.maxHealth() ), 0);
    }

    @Override
    public int strength() {
        return this.Strength;
    }

    @Override
    public void setStrength(int value) {
        this.Strength = value;
    }

    @Override
    public int baseStrength() {
        return this.baseStrength;
    }

    @Override
    public int armor() {
        return this.Armor;
    }

    @Override
    public void restoreArmor(int value) {
        this.Armor = Math.max(Math.min(this.armor() + value, this.maxArmor() ), 0);
    }

    @Override
    public int maxArmor() {
        return this.maxArmor;
    }

    @Override
    public void setMaxArmor(int value) {
        this.maxArmor = value;
        this.Armor = Math.min(this.Armor, this.maxArmor);
    }

    @Override
    public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);

    @Override
    public abstract void attack(BattleUnit other);
}