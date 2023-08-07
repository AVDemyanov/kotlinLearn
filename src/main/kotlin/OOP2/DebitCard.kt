package OOP2

abstract class DebitCard(balance: Int, creditLimit: Int) :
    BankCard(balance, creditLimit) {

    override fun upBalance() {
        super.upBalance()
    }

    override fun pay() {
        println("На какую сумму вы желаете провести оплату?")
        val n = readln().toInt()
        balance -= n
        bonusPoint = (balance * 0.10).toInt()
        cashback = ((n / 100) * 5)
        if (balance <= 0) println("Ошибка, недостаточно средст на карте")
        else println("Оплата прошла успешно. Вашбаланс - $balance, начисленно $bonusPoint бонусных баллов")
        if (n >= 5000) println("Вам начислен кэшбек $cashback")
        infoBalance()
    }

    override fun infoBalance() {
        println(
            """
            |Благодарим на использование нашего банка
            |Ваши собственные средства - $balance
            |Вам начислено бонусных баллок - $bonusPoint
            |Вам начислено кэшбека - $cashback
            """.trimMargin()
        )
    }

    override fun freeMoney() {
        println(
            """
            |Вам доступны
            |Собственные средства - $balance
            |Бонусные баллы - $bonusPoint
            |Кэшбек - $cashback
        """.trimMargin()
        )
    }
}