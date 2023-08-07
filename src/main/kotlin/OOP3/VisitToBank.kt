package OOP3

open class VisitToBank {
    open fun choiceCurrency() {
        println("""
            |Добро пожаловать в отделение банка! Для обмена валюты вам доступны:
            |1 - Доллар
            |2 - Евро
        """.trimMargin())
        var n = readln().toIntOrNull()
        when (n) {
            1 -> {
                println("Выбрал Доллар")
                startConvert(Dollar("Dollar"))
            }
            2 -> {
                println("Выбран Евро")
                startConvert(Euro("EURO"))
            }
            else -> println("Ошибка выбора, повторите запуск")
        }
    }

    open fun startConvert(converter: CurrencyConverter) {
        println("Введите сумму в рублях, которую желаете поменять:")
        val n = readln()?.toIntOrNull() ?: return
        while (n <= 0) {
            println("Ошибка. Сумма должна быть больше нуля")
            readln()?.toIntOrNull() ?: return
        }
        println("Вы получили ${converter.converToRubles(n)}")
    }
}