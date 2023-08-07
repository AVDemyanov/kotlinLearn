package Collection

import kotlin.text.toIntOrNull as toIntOrNull1

/*
Иммитиация работы телефонной книги на базе коллекций
 */
fun main() {
    //определяем количество номеров для ввода
    println("Сколько номеров хотите ввести?")
    var n = readln().toIntOrNull1() ?:0
    if (n <= 0) {
        println("Введите число больше нуля")
        n = readln().toIntOrNull1() ?:0
    }

    val phoneBook = telephoneBook(n)
    println("Список всех номеров $phoneBook")
    val userName = mutableMapOf<String, String>()
    phoneBook.forEach(){
        println("Введите имя пользователя")
        val name = readln()
        userName[it] = name
    }
    println("Абонент $userName. Номер телефона - $phoneBook")
    //фильтруем номера по префиксу по ДЗ
    val filterPhoneBook = phoneBook.filter { it.startsWith("+7") }
    println("Номера, введеные с +7 - $filterPhoneBook")
    //выбираем количество уникальных номеров по ДЗ
    val uniqueNumber = phoneBook.toSet()
    println("Количество уникальный номеров - $uniqueNumber")


}
//отдельно создаём коллекцию номеров по ДЗ
fun telephoneBook(n: Int): List<String> {
    val listPhoneBook = mutableListOf<String>()

    for (i in 0 until n) {
        println("Введите номер ${i +1}")
        val phone = readln()
        listPhoneBook.add(phone)
    }
    return listPhoneBook
}