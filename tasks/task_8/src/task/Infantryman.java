package task;

public class Infantryman extends BattleUnitBase {
    public Infantryman(String charName, int maxHealth, int baseStrength, int maxArmor) {
        super(charName, maxHealth, baseStrength, maxArmor);
    }
    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {}

    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(Math.max(this.strength() / 2, 1));
            other.damageArmor(Math.max(this.strength() / 4, 1));
        } else other.takeDamage(this.strength());
    }
}