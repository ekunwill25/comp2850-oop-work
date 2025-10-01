fun main() {
    println("(a) Margherita")
    println("(b) Pepperoni")
    println("(c) Hawaiian")
    println("(d) Seafood")
    println("Please select the pizza that you wanta")
    var pizza = readln().lowercase()
    if (pizza == "a") {
        println("You have selected Margherita")}
    else if (pizza == "b"){
        println("You have selected Pepperoni")}
    else if (pizza == "c"){
        println("You have selected Hawaiian")}
    else if (pizza == "d"){
        println("You have selected Seafood")}
    else {
        println("Error: Invalid selection")}
}