import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4,6,8,10,12,20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        
        println("You rolled a $result")
    }
    else {
        println("Error: A d$sides does not exist.")
    }
}

fun rollDice(sides: Int = 6, numberOfDice: Int = 1) {
    if (sides in setOf(4,6,8,10,12,20)) {
        println("Rolling ${numberOfDice}d$sides...")
        var totalScore = 0
        
        for (i in 1..numberOfDice) {
            val result = Random.nextInt(1, sides + 1)
            totalScore += result
        }
        
        println("You rolled a total of $totalScore")
    }
    else {
        println("Error: A d$sides does not exist.")
    }
}

fun main() {
    // Test with default values (6 sides, 1 die)
    println("Test 1: Default values")
    rollDice()
    
    println("\nTest 2: Positional arguments (20 sides, 3 dice)")
    rollDice(20, 3)
    
    println("\nTest 3: Named arguments")
    rollDice(sides = 8, numberOfDice = 2)
    
    println("\nTest 4: Only specifying number of dice (default 6 sides)")
    rollDice(numberOfDice = 4)
    
    println("\nTest 5: Only specifying sides (default 1 die)")
    rollDice(sides = 12)