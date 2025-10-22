package Wordle
import java.io.File

fun main() {
    println("Welcome to Wordle!")
    println("========space space space==========")
    
    // Read the word list
    val words = readWordList("data/words.txt")
    println("Loaded ${words.size} words")
    
    // Pick a random target word
    val target = pickRandomWord(words)
    
    // Game loop
    var won = false
    val maxAttempts = 10
    
    for (attempt in 1..maxAttempts) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)
        
        // Check if the player won
        if (guess == target) {
            println("\nCongratulations! You guessed the word in $attempt attempts!")
            won = true
            break
        }
    }
    
    // If the player didn't win
    if (!won) {
        println("\nGame Over! The word was: $target")
    }
}