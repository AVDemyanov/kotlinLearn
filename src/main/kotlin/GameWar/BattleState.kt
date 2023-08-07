package GameWar

import kotlin.random.Random

sealed class BattleState(team1: Team,team2: Team) {
    protected val teamOneWarrior = team1.team.filter { it.isKilled.not() }
    protected val teamTwoWarrior = team2.team.filter { it.isKilled.not() }

    class Progress(team1: Team, team2: Team): BattleState(team1, team2) {
        fun attack() {
            teamOneWarrior.forEach{
                it.attack(teamTwoWarrior[Random.nextInt(0, teamTwoWarrior.lastIndex)])
            }
            teamTwoWarrior.forEach{
                it.attack(teamOneWarrior[Random.nextInt(0,teamOneWarrior.lastIndex)])
            }
        }
    }

    class TeamOneIsWin(team1: Team,team2: Team): BattleState(team1, team2) {
        fun isWin(): Boolean = isWin()
    }

    class TeamTwoIsWin(team1: Team, team2: Team): BattleState(team1, team2) {
        fun isWin(): Boolean = isWin()
    }

    class NoWin(team1: Team, team2: Team): BattleState(team1, team2) {
        fun isWin(): Boolean = isWin()
    }
}