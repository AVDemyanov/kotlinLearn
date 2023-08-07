package OOP3

class Dollar(override val currencyCode: String):
    CurrencyConverter {
        //конвертируем по курсу
    override fun converToRubles(rub: Int): Double {
        return (rub/95).toDouble()
    }
}