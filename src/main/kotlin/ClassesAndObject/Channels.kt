package ClassesAndObject

object Channels {
    //создаём лист с базой каналов
    private val channelList = mutableListOf<String>(
        "Первый", "Спорт", "СТС", "ТНТ",
        "Детский", "Муз ТВ",
        "2х2", "Игровой", "НТВ", "Новости24"
    )
    //по условиям задания у пользователя могут использоваться не все каналы, а значит надо узнать количество канало от 1 до 10, перемешать и взять нужное количество
    fun getRandomChannels(): List<String> {
        println("Введите количество каналов от 1 до 10")
        val n = readlnOrNull()?.toIntOrNull()!!
        return channelList.shuffled().take(n)
    }
}