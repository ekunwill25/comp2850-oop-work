fun anagrams(name1: String, name2: String): Boolean {
    if (name1.length != name2.length) {
        return false
    }
    val sortedname1 = name1.lowercase().toList().sorted()
    val sortedname2 = name2.lowercase().toList().sorted()
    return sortedname1 == sortedname2

}

fun main() {
    println("Enter the first word:")
    val word1 = readln()
    println("Enter the second word:")
    val word2 = readln()
    if (anagrams(word1, word2)) {
        println("These words are anagrams!")
    }
    else {
        println("Oh HN man, these are not anagrams")

    }
}
