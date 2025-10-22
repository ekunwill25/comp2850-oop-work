import java.io.File

fun isValid(word: String): Boolean {
    return word.length == 5 && word.all { it.isLetter() } // Checks that every character is a letter //
}

fun readWordList(filename: String): MutableList<String> {
    val words = mutableListOf<String>()
    val lines = File(filename).readLine() // reads the entire file at once //

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
    
    val RI = words.indices.random()
    val chosenWord = words[RI]
    words.removeAt(RI)
    
    return chosenWord
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = mutableListOf<Int>()
    
    for (i in 0 until 5) {
        if (guess[i] == target[i]) {
            result.add(1)
        } else {
            result.add(0)
        }
    }
    
    return result
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt: ")
        val input = readLine()
        
        if (input != null && isValid(input)) {
            return input.lowercase()
        } else {
            println("Please enter a valid 5-letter word.")
        }
    }
}

fun displayGuess(guess: String, matches: List<Int>) {
    val display = StringBuilder()
    
    for (i in 0 until 5) {
        if (matches[i] == 1) {
            display.append(guess[i])
        } else {
            display.append('?')
        }
    }
    
    println(display.toString())
}