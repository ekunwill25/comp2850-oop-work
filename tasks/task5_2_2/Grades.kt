fun main(args: Array<String>) {
    fun grade(mark: Int): String{
        return when (mark) {
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
    }

    for (arg in args) {
        val score = arg.toIntOrNull()
        if (score == null) {
            println("Put a real number")
        } else {
            println("$score is a ${grade(score)}")
        }
    }
}
