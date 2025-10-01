import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("Enter the first grade")
    var grade1 = readln().toInt()
    println("Enter the second grade")
    var grade2 = readln().toInt()
    println("Enter the third grade")
    var grade3 = readln().toInt()
    var average = (grade1 + grade2 + grade3) / 3
    val result = when (average) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Invalid grade"
    }
    println("Average: $average")
    println("Result: $result")
}