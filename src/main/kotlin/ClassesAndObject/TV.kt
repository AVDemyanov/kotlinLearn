package ClassesAndObject

import kotlin.random.Random


class TV(val brand: String, val model: String, val diagonal: Double) {

    private val listChannel = Channels.getRandomChannels()

    init {
        println("Телевизор включается...")
    }

    fun tvIsOn() {
        println("Телевизор включён")
    }

    tailrec fun installVolume() {
        println("Шкала громкости от 0 до 10, какую громкость хотите задать?")
        val n = readLine()?.toIntOrNull() ?: 0
        when (n) {
            in 0..10 -> println("Ваша громкость установлена - $n")
            else -> {
                println("Ошибка, повторите ввод")
                installVolume()
            }
        }
    }

    fun startChannel() {
        val startChannel = Random.nextInt(0, listChannel.lastIndex)
        println("Вам доступны каналы $listChannel")
        println("Ваш канал ${listChannel[startChannel]}")
    }

    fun changeChannel () {
        println("Введите номер канала для переключения")
        val m = readln()?.toInt()
        if (m != null) {
            println(listChannel.elementAt((m - 1)!!))
        }
        }
    }



