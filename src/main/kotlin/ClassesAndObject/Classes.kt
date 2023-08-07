package ClassesAndObject
/*
Имитируем работу телевизора при помощи Классов и объекта
 */
fun main() {
    val lg = TV("LG", "TV MAX", 35.0)
    lg.tvIsOn()
    lg.startChannel()
    lg.installVolume()
    lg.changeChannel()
}