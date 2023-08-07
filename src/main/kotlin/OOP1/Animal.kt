package OOP1

import kotlin.random.Random

/*
Создаём базовый класс с параметрами (конструктором) и методами его действиями
 */
open class Animal(
    var energy: Int,
    var weight: Int,
    var currentAge: Int,
    var maxAge: Int,
    var name: String
) {

    fun sleep() {
        val animalSleepEnergy = energy + 5
        val animalSleepAge = currentAge + 1
        println("$name спит. Энергия теперь $animalSleepEnergy, а возраст $animalSleepAge")
    }

    fun eat() {
        val animalEatEnergy = energy + 3
        val animalEatWeight = weight + 1
        println("$name покушал. Энергия - $animalEatEnergy, вес $animalEatWeight")
    }

    //открываем для логических изменений у наследников. рыбка плавает, птичка летает и так далее
    open fun animalIsGoWalk() {
        val animalWalkEnergy = energy - 5
        val animalWalkWeight = weight - 1
        println("$name гуляет, Энергии осталось $animalWalkEnergy, вес теперь $animalWalkWeight, а возраст ${chanceToOld()}")
    }

    open fun chanceToOld(): Int {
        if (Random.nextBoolean())
            currentAge += 1
        return currentAge
    }

    fun isTooOld(): Boolean {
        return currentAge >= maxAge
    }

    //открываем для логических изменений, так как у птички родится птичка, а не просто животное и так далее
    open fun bornChild(): Animal {
        energy = Random.nextInt(0, 10)
        weight = Random.nextInt(0, 5)
        currentAge = 0
        println("На свет появился $name! Его энергия - $energy, вес - $weight, а максимальный возраст $maxAge")
        return Animal(energy, weight, currentAge, maxAge, name)
    }
}