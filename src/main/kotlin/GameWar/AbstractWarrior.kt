package GameWar

abstract class AbstractWarrior(
    open var maxHealth: Int,
    open var evasion: Int,
    open var accuracy: Int,
    open var weapon: AbstractWeapon,
    open var currentHealth: Int
) : Warrior {
    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        isKilled = currentHealth <= 0
    }

    override fun attack(enemy: Warrior) {
        if (weapon.isEmpty) {
            println("Магазин пуст, надо перезарядить")
            weapon.reloadPatron()
        } else {
            println("Выстрел ")
            weapon.getAmmo()
            if (evasion.isChanceReaziled() && accuracy.isChanceReaziled()) {
                print("в противника. Урон нанесён, его здоровье $currentHealth")
            } else print("мимо. Цельтесь лучше")
        }

    }
}