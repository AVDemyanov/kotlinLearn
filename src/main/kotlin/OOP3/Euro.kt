package OOP3

class Euro(override val currencyCode: String): CurrencyConverter {
    //конвертируем по курсу
    override fun converToRubles(rub: Int): Double {
        return (rub/105).toDouble()
    }
}