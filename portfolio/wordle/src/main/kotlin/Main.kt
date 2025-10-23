private const val MAX_ATTEMPTS = 6

fun main() {
    println("Welcome to Wordle!")
    println("========space space space==========") // the space before typing

    // Read the word list
    val words = readWordList("data/words.txt")
    println("Loaded ${words.size} words")

    // random word selection
    val target = pickRandomWord(words)

    // loop for user attempts
    var won = false

    for (attempt in 1..MAX_ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        // winning checker
        if (guess == target) {
            println("\nCongratations! You guessed the word in $attempt attempts!")
            won = true
            break
        }
    }

    // If player didn't win
    if (!won) {
        println("\nGame Over! The word was: $target")
    }
}
