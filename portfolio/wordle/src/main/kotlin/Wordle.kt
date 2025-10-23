package wordle
import java.io.File


fun isValid(word: String): Boolean {
    return word.length == 5 && word.all { it.isLetter() } // Checks that every character is a letter //
}

fun readWordList(filename: String): MutableList<String> {
    val words = mutableListOf<String>() // creates an empty list of strings //
    val lines = File(filename).readLines() // reads the entire file at once //

    for (line in lines) {
        val trimmed = line.trim()
        if (isValid(trimmed)) {
            words.add(trimmed.lowercase())
        }
    }

    return words
}

fun pickRandomWord(words: MutableList<String>): String {
    if (words.isEmpty()) {
        throw IllegalStateException("Word list is empty") // stops program for an error
    }
    
    val RI = words.indices.random() // random index
    val chosenWord = words[RI] // word at random index
    words.removeAt(RI) // removes chosen word from list to avoid repetition //
    
    return chosenWord 
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = mutableListOf<Int>() // list to hold results //
    
    for (i in 0 until 5) { 
        if (guess[i] == target[i]) { 
            result.add(1) // correct letter/position //
        } else {
            result.add(0) // incorrect letter/position //
        }
    }
    
    return result
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt: ") // prompt for user input whilst putting the attempt number //
        val input = readLine() // reads user input //
        
        if (input != null && isValid(input)) {
            return input.lowercase() // returns valid input in lowercase //
        } else {
            println("Please enter a valid 5-letter word.")
        }
    }
}

fun displayGuess(guess: String, matches: List<Int>) {
    val display = StringBuilder() // to build the display string //
    
    for (i in 0 until 5) {
        if (matches[i] == 1) {
            display.append(guess[i]) // correct letter/position shown //
        } else {
            display.append('?') // incorrect letter/position shown as '?' //
        }
    }
    
    println(display.toString())
}