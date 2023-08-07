package OOP2

import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

abstract class CreditCard(balance: Int, creditLimit: Int) :
    BankCard(balance, creditLimit) {
    override var creditLimit: Int = 10000
    private var creditMoney = Random.nextInt(0,10000)

    override fun upBalance() {
        println("На какую сумму хотите пополнить карту?")
        val n = readln().toInt()
        if (n != null) {
            creditMoney += n
            val overCharge = maxOf(0, creditMoney - creditLimit)
            balance += overCharge
            creditMoney = minOf(creditLimit,creditMoney)
            println("Карта успешно пополненна")
        } else println("Ошибка пополнения карты")
        infoBalance()
    }

    override fun pay() {
        println("На какую сумму будет оплата?")
        val n = readln().toInt()
        if (n != null) {
            if (n >= creditLimit + balance) println("Упс, кажется нет денег")
            else {
                creditMoney -= n
                val overDraft = minOf(0,balance)
                creditMoney += overDraft
                balance = maxOf(0,balance)
                println("Оплата прошла успешно")
            }
        }
        else println("Введена некорректная сумма")
        bonusPoint = (balance * 0.1).toInt()
        cashback = ((n / 100)* 5)
        infoBalance()
    }

    override fun infoBalance() {
        println("""
            |Благодарим за выбор нашего банка
            |Кредитный баланс - $creditMoney, лимит кредитной карты - $creditLimit
            |Собственные средства - $balance
            |Бонусные баллы - $bonusPoint
            |Кэшбек - $cashback
        """.trimMargin())
    }

    override fun freeMoney() {
        println("""
            Вам доступны:
            Кредитные средства - $creditMoney из лимита в $creditLimit
            Cобственные средства - $balance
            Бонусные баллы - $bonusPoint
            Кэшбек- $cashback
        """.trimIndent())
    }
}