fun main() {
    println("(a) Margherita")
    println("(b) Pepperoni")
    println("(c) Hawaiian")
    println("(d) Seafood")
    
    var pizza: String
    
    // Loop until valid input is received
    do {
        println("Please select the pizza that you wanta")
        pizza = readln().lowercase()
        
        if (pizza != "a" && pizza != "b" && pizza != "c" && pizza != "d") {
            println("Error: This is not on da lista.")
        }
    } while (pizza != "a" && pizza != "b" && pizza != "c" && pizza != "d")
    
    // Display the selected pizza
    when (pizza) {
        "a" -> println("You have selected Margherita")
        "b" -> println("You have selected Pepperoni")
        "c" -> println("You have selected Hawaiian")
        "d" -> println("You have selected Seafood")
    }
}