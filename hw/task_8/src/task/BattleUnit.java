package task;

public interface BattleUnit {
    /*
     *   Методы:
     *       String name()                   - возвращает имя персонажа
     *       int health()                    - возвращает текущее здоровье
     *       int maxHealth()                 - возвращает максимальное здоровье
     *       void setMaxHealth(int value)    - делает значение максимального здоровья равным value
     *       void heal(int value)            - восстанавливает value единиц здоровья
     *       void takeDamage(int value)      - наносит value единиц урона
     *       int strength()                  - возвращает текущую силу атаки
     *       void setStrength(int value)     - делает текущее значение силы равным value
     *       int baseStrength()              - возвращает базовую силу атаки (без учета бонусов)
     *       int armor()                     - возвращает текущее значение брони
     *       void restoreArmor(int value)    - восстанавливает value едуниц брони
     *       void damageArmor(int value)     - сбивает value едуниц брони
     *       int maxArmor()                  - возвращает максимальное значение брони
     *       void setMaxArmor(int value)     - делает значение максимальной брони равным value
     *
     *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
     *           - применяет спец-способность к некоторым объектам ownTeam, enemyTeam
     *       void attack(BattleUnit other)           - применяет атаку к объекту other
     * ------------------------------------------------------------------------------------------
     */
    String name();
    int health();
    int maxHealth();
    void setMaxHealth(int value);
    void heal(int value);
    default void takeDamage(int value){ this.heal(-value); };
    int strength();
    void setStrength(int value);
    int baseStrength();
    int armor();
    void restoreArmor(int value);
    default void damageArmor(int value){ this.restoreArmor(-value);};
    int maxArmor();
    void setMaxArmor(int value);
    void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    void attack(BattleUnit other);
}
