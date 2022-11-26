package task;

public class Alchemist extends BattleUnitBase {
    public Alchemist(String charName, int maxHealth, int baseStrength, int maxArmor) {
        super(charName, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int MinHealth = Integer.MAX_VALUE, index1 = 0;
        int MaxHealth = Integer.MIN_VALUE, index2 = 0;

        for (int i = 0; i < ownTeam.length; i++) {
            if (ownTeam[i].health() <= 0) continue;

            final int teamHealth = ownTeam[i].health();

            if (teamHealth < MinHealth) {
                MinHealth = teamHealth;
                index1 = i;
            }

            if (teamHealth > MaxHealth) {
                MaxHealth = teamHealth;
                index2 = i;
            }
        }

        final BattleUnit teamLowHealth = ownTeam[index1];
        final BattleUnit teamHighHealth = ownTeam[index2];

        teamLowHealth.heal(10);
        teamHighHealth.setStrength(teamHighHealth.strength() + 1);
    }

    @Override
    public void attack(BattleUnit other) {
        other.setStrength(other.strength() - 2);
        other.setMaxHealth(other.maxHealth() - 4);
    }
}