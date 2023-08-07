package OOP2
/*
Делаем мини банкомат.
Есть абстракция в виде карты, как сущности. На её базе делаем дебетовые и кредитные карты.
А вот от них уже создаём настоящие банковские карты желтого и зеленого банков
 */
fun main() {
val greenBank = GreenBankCreditCard(1000,0,0,0)
    greenBank.upBalance()
    greenBank.pay()
    greenBank.freeMoney()

    val yellowBank = YellowBankDebitCard(500,0,0,0)
    yellowBank.upBalance()
    yellowBank.pay()
    yellowBank.freeMoney()
}