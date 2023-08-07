package OOP2

class GreenBankCreditCard(
    balance: Int, creditLimit: Int, override var cashback: Int, override var bonusPoint: Int):
    CreditCard(balance, creditLimit){
    init {
        println("Вы используете кредитную карту популярного зеленого банка")
        infoBalance()
    }

    override fun upBalance() {
        super.upBalance()
    }

    override fun pay() {
        super.pay()
    }
}