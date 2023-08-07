package GameWar

class Captain(
    maxHealth: Int, evasion: Int, accuracy: Int, currentHealth: Int,
    override var isKilled: Boolean,
    override var avoidChance: Int
) : AbstractWarrior(maxHealth, evasion, accuracy, Weapons.shotgun, currentHealth) {
    override fun attack(enemy: Warrior) {
        super.attack(enemy)
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}
