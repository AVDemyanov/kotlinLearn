package GameWar

interface Warrior {
    var isKilled: Boolean
    var avoidChance: Int

    fun attack(enemy: Warrior)
    fun takeDamage(damage: Int)
}