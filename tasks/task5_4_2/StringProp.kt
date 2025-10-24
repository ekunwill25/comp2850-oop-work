

val String.tooLong: Boolean get() = this.length > 20

fun main() {
    println("Please input a string under 20 characters:")
    val ui = readln()
    if (ui.tooLong) {
        println("The string is too long!")
    } 
    else {
        println("The string is acceptable.")
    }
}
    
