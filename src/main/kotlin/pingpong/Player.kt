package pingpong

import kotlin.random.Random

//skal kunne spille om ett enkelt poeng
//har en forståelse om sitt eget ferdighetsnivå (tall fra 1-10)
class Player(
    private val skill: Int
) {

    //spille ett poeng med bortennis
    //velg vinneren tilfeldig basert på hvor god spilleren er i forhold til motspiller
    //returner vinneren
    fun play(opponent: Player): Player {
        return if (won(opponent)) this else opponent
    }

    private fun won(opponent: Player) = Random.nextInt(skill+opponent.skill) < skill

}