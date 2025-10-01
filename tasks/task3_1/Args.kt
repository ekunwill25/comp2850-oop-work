import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: filename required as two arguments")
        exitProcess(1)
        }
    print(args)
    print(args)
}