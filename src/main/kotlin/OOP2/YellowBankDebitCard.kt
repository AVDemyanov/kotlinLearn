package OOP2

class YellowBankDebitCard(
    balance: Int, creditLimit: Int, override var cashback: Int, override var bonusPoint: Int
): DebitCard(balance, creditLimit) {
    init {
        println("Вы используете дебетовую карту очень популярного желтого банка")
        infoBalance()
    }

    override fun pay() {
        super.pay()
    }

    override fun upBalance() {
        super.upBalance()
    }

    override fun infoBalance() {
        super.infoBalance()
    }
}