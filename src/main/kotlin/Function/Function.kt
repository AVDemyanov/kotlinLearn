package Function
/*
Задача: есть некая фраза, которую зашифровали путем перестановки и замены символов.
В итоге получили F2p)v"y233{0->c}ttelciFc
Алгоритм шифрования:
    1.Разделить сообщение пополам.
    Обработать первую половину сообщения следующим образом:
    2.1. В исходном тексте заменить все символы о на символ 0 (ноль).
    2.2. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 3 правее от исходного (сдвиг каждого символа вправо на 3).
    2.3. В получившемся тексте заменить все символы u на цифру 4.
    2.4. В получившемся тексте заменить все символы s на цифру 5.
    2.5. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 1 левее от исходного (сдвиг каждого символа влево на 1).
    Вторую половину сообщения обработать так:
    3.1. Заменить пробелы на символ _
    3.2. В получившемся тексте заменить каждый символ сообщения символом, стоящим на 4 правее от исходного (сдвиг каждого символа вправо на 4).
    3.3. Развернуть получившуюся строку.
    4. Соединить обе зашифрованные половины.
 */
//работаем над первой строкой

fun main() {
println("Let's go")
    println(firstString("""F2p)v"y233{0->c}ttelciFc"""))
    println(secondString())
}
//работаем над первой строкой
fun firstString(message: String) {
    //берем первую часть сообщения
    val firstPartOfString = message.dropLast(message.length/2)
    //двигаем символ
    val shiftedString = firstPartOfString.map { char -> char + 1 }.joinToString("")
    //меняем буквы по заданному алгоритму
    val symbolS = shiftedString.replace("5","s", false)
    val symbolU = symbolS.replace("4","u", false)
    val shiftedChar = symbolU.map{ char -> char - 3}.joinToString("")
    val symbolO = shiftedChar.replace("0", "o", false)
    //не забываем печатать, чтобы увидеть потом строку
    println(symbolO)
}

//работаем над второй строкой
fun secondString() {
    //исходное сообщения для разнообразия не прописываем в тело функции, а задаём переменной
    val message = """F2p)v"y233{0->c}ttelciFc"""
    //берем вторую часть
    val secondPartOfString = message.drop(message.length/2)
    //разворачиваем её
    val reversedSecondString = secondPartOfString.reversed()
    //ряд операций
    val shiftedSecondString = reversedSecondString.map { char -> char -4 }.joinToString("")
    val symbolProbel = shiftedSecondString.replace("_"," ",false)
    println(symbolProbel)
}