fun main() {
    println("Please input your name:")
    val name = readLine()
    val length = name?.length
    println("Hello, $name! Your name is $length characters long.")
}
## Control + D ends input and runs it as null