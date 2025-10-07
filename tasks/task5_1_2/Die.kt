import kotlin.random.Random
fun rollDie(sides: Int) {
    if (sides in setOf(4,6,8,10,12,20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled a $result")
    }
    else {
        println("Error: A d$sides does not exist.")
    }
}

fun main() {
    println("Please enter the number of sides that your die will have:")
    val sides = readln().toInt()
    return rollDie(sides)
}