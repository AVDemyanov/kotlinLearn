package GameWar

object Weapons {
    val pistol: AbstractWeapon = object : AbstractWeapon(maxAmmo = 7, fireType =
    FyreType.Single, typeWeapon = "Пистолет"){
        override fun createPatron(): Ammo {
            return Ammo.DEAGLE
        }
    }

    val shotgun: AbstractWeapon = object : AbstractWeapon(maxAmmo = 10, fireType = FyreType.Single,
        typeWeapon = "Дробовик"){
        override fun createPatron(): Ammo {
            return Ammo.MAGNUM
        }
    }

    val revolver: AbstractWeapon = object : AbstractWeapon(maxAmmo = 6, fireType = FyreType.Single,
        typeWeapon = "Револьвер"){
        override fun createPatron(): Ammo {
            return Ammo.NAGAN
        }
    }

}