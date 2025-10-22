package Wordle
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.assertions.throwables.shouldThrow


import io.kotest.core.spec.style.StringSpec // library for testing
import io.kotest.matchers.shouldBe // library for testing 

class WordleTest : StringSpec({
    
    "isValid should return true for 5-letter words" {
        isValid("hello") shouldBe true
        isValid("rebel") shouldBe true
        isValid("APPLE") shouldBe true
    }
    
    "isValid should return false for words that are not 5 letters" {
        isValid("cat") shouldBe false
        isValid("ohio") shouldBe false
        isValid("") shouldBe false
    }
    
    "isValid should return false for words with numbers or symbols" {
        isValid("hell0") shouldBe false
        isValid("wor-dle") shouldBe false
        isValid("app3ee") shouldBe false
    }
})

"readWordList should read valid words from any file" {
    val words = readWordList("data/words.txt") // file we were given to read from
    words.size shouldBeGreaterThan 0
    words.all { isValid(it) } shouldBe true
}

"readWordList should decline invalid words" {
    // This test assumes you have a test file, or you can test with the main file
    val words = readWordList("data/words.txt")
    words.forEach { word ->
        word.length shouldBe 5
    }
}

"pickRandomWord should return a word from the list" {
    val words = mutableListOf("hello", "world", "apple", "grape", "lemon")
    val originalSize = words.size
    val picked = pickRandomWord(words)
    
    picked.length shouldBe 5
    words.size shouldBe originalSize - 1
    words.contains(picked) shouldBe false
}

"pickRandomWord should throw exception for an empty list" {
    val emptyList = mutableListOf<String>()
    shouldThrow<IllegalStateException> {
        pickRandomWord(emptyList)
    }
}

"evaluateGuess should return all 1s for correct guess" {
    evaluateGuess("hello", "hello") shouldBe listOf(1, 1, 1, 1, 1)
}

"evaluateGuess should return all 0s for completely wrong guess" {
    evaluateGuess("abcde", "fghij") shouldBe listOf(0, 0, 0, 0, 0)
}

"evaluateGuess should return mixed results for partial matches" {
    evaluateGuess("hello", "helps") shouldBe listOf(1, 1, 1, 0, 0)
}