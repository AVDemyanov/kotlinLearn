package OOP1

import kotlin.random.Random

class Fish: Animal {
    constructor(energy: Int,weight: Int, currentAge: Int, maxAge: Int, name: String):
            super(energy, weight, currentAge, maxAge, name)

    override fun animalIsGoWalk() {
        var animalGoEnergy = energy - 5
        var animalGoWeight = weight - 1
        println("${name} плывет. Энергия - $animalGoEnergy, новый вес - $animalGoWeight, возраст - ${chanceToOld()}")

    }

    override fun bornChild(): Fish {
        energy = Random.nextInt(1,10)
        weight = Random.nextInt(1,3)
        currentAge = 0
        println("На свет появился ${name}, энергия - ${energy}, вес - ${weight}, максимальный возраст жизни - ${maxAge}")
        return Fish(energy, weight, currentAge, maxAge, name)
    }
}