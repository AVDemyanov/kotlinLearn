package OOP1

open class NatureReserve {
    //сам заповедник строится на базе Animal
    open val pets: MutableList<Animal> = mutableListOf(
        Bird(energy = 7, weight = 2, currentAge = 3, maxAge = 5, name = "Орёл"),
        Bird(energy = 4, weight = 1, currentAge = 1, maxAge = 3, name = "Воробей"),
        Bird(energy = 2, weight = 2, currentAge = 3, maxAge = 6, name = "Голубь"),
        Bird(energy = 6, weight = 1, currentAge = 3, maxAge = 5, name = "Волнистый попугай"),
        Bird(energy = 5, weight = 3, currentAge = 40, maxAge = 75, name = "Страус"),
        Fish(energy = 4, weight = 5, currentAge = 7, maxAge = 20, name = "Акула"),
        Fish(energy = 3, weight = 1, currentAge = 15, maxAge = 23, name = "Окунь"),
        Fish(energy = 6, weight = 1, currentAge = 10, maxAge = 15, name = "Золотая рыбка"),
        Dog(energy = 3, weight = 3, currentAge = 6, maxAge = 15, name = "Мопс"),
        Dog(energy = 3, weight = 3, currentAge = 3, maxAge = 12, name = "Пекинес")
    )
    //создаём метод, в который закладываем количество жизненных циклов. форычем ходим до победного countCycle
    open fun lifeCycle(countCycle: Int) {
        for (cycle in 1..countCycle)
            if (pets.isEmpty()) {
                println("Заповедник опустел")
                return
            } else {
                for (Animal in pets.indices)
                    when ((1..4).random()) {
                        1 -> pets[Animal].sleep()
                        2 -> pets[Animal].eat()
                        3 -> pets[Animal].animalIsGoWalk()
                        4 -> {
                            val child = pets[Animal].bornChild()
                            pets.add(child)
                        }
                    }
            }
        println("В заповедние ${pets.size} животных")
    }
}