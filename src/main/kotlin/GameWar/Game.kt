package GameWar

import kotlin.random.Random
/*
Работает, но через раз крашится из-за рекурсии. Как нибудь перепишу на свой лад на базе WarCraft.
Создаём игру, в которой сражаются 2 команды войнов.
Войны бывают 3 видов(Генерал, Солдат, Капитан)
Они вооружены пистолетами Deagle и Наган (револьвер), а так же есть ружье Mangum
Стреляют по очереди, программа отображает статус битвы
 */
fun main() {
    println("Добро пожаловать в игру")
    var a = Battle()
    a.startBattle()
    a.getBattleState()
}

fun Int.isChanceReaziled(): Boolean =
    Random.nextInt(0, 10) < this
