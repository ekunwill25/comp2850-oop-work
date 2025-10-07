import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun circleArea(radius: Double) = PI * radius.pow(2)
fun circlePerim(radius: Double) = 2 * PI * radius
fun readDouble(val1: String): Double{
    println("Please enter the value:")
    return readln().toDouble()
}

fun main() {
    println("Welcome to the circle calculator!")
    println("Please type if you are ready to proceed:")
    val val1 = readln()
    val radius = readDouble(val1)
    val area = circleArea(radius)
    val perim = circlePerim(radius)
    println("The area of your circle is %.2f".format(area))
    println("The perimeter of your circle is %.2f".format(perim))
}