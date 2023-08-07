package GameWar

import java.util.Stack

abstract class AbstractWeapon(
    var maxAmmo: Int,
    var fireType: FyreType,
    var patronMagazin: Stack<Ammo> = Stack(),
    var isEmpty: Boolean = true,
    var typeWeapon: String
) {
    open fun magazinIsEmpty(): Boolean {
        return magazinIsEmpty()
    }

    open fun getPatron(): Boolean {
        if (patronMagazin.isEmpty())
            isEmpty = true
        return isEmpty
    }

    open fun reloadPatron(): Boolean {
        for (i in 0 until maxAmmo)
            patronMagazin.push(createPatron())
        isEmpty = false
        return true
    }

    open fun getAmmo(): Int? {
        if (patronMagazin.isEmpty()) isEmpty = true
        if (isEmpty) {
            reloadPatron()
            return 0
        }
        return patronMagazin.pop()?.currentDamage()
    }

    abstract fun createPatron(): Ammo

}