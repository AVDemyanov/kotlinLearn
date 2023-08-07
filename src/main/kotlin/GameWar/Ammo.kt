package GameWar

enum class Ammo(
    var damage: Int,
    var chanceCriticalDamage: Int,
    var coefficientCriticalDamage: Int
) {
    MAGNUM(4,8,2),
    NAGAN(2,5,1),
    DEAGLE(7,15,5);

    open fun currentDamage(): Int {
        val currentDamage: Int = if (chanceCriticalDamage.isChanceReaziled()) {
            damage * chanceCriticalDamage
        } else {
            damage
        }
        return currentDamage
    }

}