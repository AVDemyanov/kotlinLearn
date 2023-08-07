package OOP3

interface CurrencyConverter {
    val currencyCode: String
    //у каждой валюты своё соотношение к рублю, поэтому создаём метод в интерфейсе, который переопределим в классах
    fun converToRubles(rub: Int): Double
}