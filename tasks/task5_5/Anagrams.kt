infix fun String.anagramOf(other: String): Boolean {
    val sortedThis = this.lowercase().toList().sorted()
    val sortedOther = other.lowercase().toList().sorted()
    return this.length == other.length && sortedThis == sortedOther
}

fun main() {
    println("Enter the first word:")
    val word1 = readln()
    println("Enter the second word:")
    val word2 = readln()
    
    if (word1 anagramOf word2) {
        println("$word1 and $word2 are anagrams!")
    } else {
        println("Oh HN man, these are not anagrams")
    }
}