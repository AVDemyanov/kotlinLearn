package GameWar

class Battle {
    var team1 = Team(3)
    var team2 = Team(3)

    fun startBattle() {
        var startTeam1 = team1.getTeam()
        var startTeam2 = team2.getTeam()
    }

    fun getBattleState() {
        if (team2.team.size == 0 && team1.team.size > 0) {
            println(BattleState.TeamOneIsWin(team1, team2))
        } else if (team1.team.size == 0 && team2.team.size > 0) {
            println(BattleState.TeamTwoIsWin(team1, team2))
        } else if (team1.team.size == 0 && team2.team.size == 0) {
            println(BattleState.NoWin(team1, team2))
        } else BattleState.Progress(team1, team2).attack()
        getBattleState()
    }

}