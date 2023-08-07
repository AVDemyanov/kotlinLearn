package GameWar

open class Team(i: Int) {
    var team: MutableList<AbstractWarrior> = mutableListOf()
    val general = General(30, 2, 4, 30, false, 2)
    val captain = Captain(20, 2, 4, 20, false, 2)
    val soldier = Soldier(10, 1, 2, 10, false, 1)

    init {
        while (team.size < i)
            getTeam()
    }

    open fun addTeam() {
        println("Введите количество войнов")
        var addTeam = readln().toInt()
        while (team.size < addTeam)
            getTeam()
    }

    open fun getTeam() {
        if (10.isChanceReaziled()) {
            team.add(general)
        } else if (40.isChanceReaziled()) {
            team.add(captain)
        }
        team.add(soldier)
    }
}

private fun <E> MutableList<E>.add(element: Int) {

}

private fun <E> MutableList<E>.add(element: General) {

}

private fun <E> MutableList<E>.add(element: Captain) {

}

private fun <E> MutableList<E>.add(element: Soldier) {

}