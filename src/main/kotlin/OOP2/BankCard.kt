package OOP2

import kotlin.time.times

abstract class BankCard(
    open var balance: Int,
    open var creditLimit: Int
) {
    abstract var cashback: Int
    abstract var bonusPoint: Int
    open fun upBalance() {
        println("На какую сумму желаете пополнить карту?")
        val n = readln().toInt()
        balance += n
        println("Ващ баланс - $balance")
    }

    open fun pay() {
        println("На какую сумму желаете провести оплату?")
        val n = readln().toInt()
        balance -= n
        bonusPoint = (balance * 0.1).toInt()
        if (balance <= 0) println("Отказ транзакции, недостаточно средств")
        else println("Оплата успешна. Ваш баланс - $balance, начислено бонусов - $bonusPoint")
    }

    open fun infoBalance() {
        println(
            """
            | Баланс карты - $balance
            | Бонусных баллов накопленок - $bonusPoint
            | Накопленный кэшбек - $cashback
        """.trimMargin()
        )
    }
    open fun freeMoney() {}

}