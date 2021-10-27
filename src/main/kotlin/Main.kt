fun main() {
    val manalFirstDice = Dice(6)
    println("Your ${manalFirstDice.numSides} sided dice rolled ${manalFirstDice.roll()}!")

    val manalSecondDice = Dice(20)
    println("Your ${manalSecondDice.numSides} sided dice rolled ${manalSecondDice.roll()}!")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
    return (1..numSides).random()
    }
}