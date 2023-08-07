package OOP1

import kotlin.random.Random

class Dog: Animal {
    constructor(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String):
    super(energy, weight, currentAge, maxAge, name)

    override fun animalIsGoWalk() {
        val animalWalkEnergy = energy - 5
        val animalWalkWeight = weight - 1
        println("$name бежит, Энергии осталось $animalWalkEnergy, а вес теперь $animalWalkWeight")
    }

    override fun bornChild(): Dog {
        energy = Random.nextInt(1,10)
        weight = Random.nextInt(1,5)
        currentAge = 0
        println("На свет появился ${name}, энергия - ${energy}, вес - ${weight}, максимальный возраст жизни - ${maxAge}")

        return Dog(energy, weight, currentAge, maxAge, name)
    }
}