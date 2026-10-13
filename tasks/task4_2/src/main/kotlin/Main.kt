// Task 4.2: use of if and ranges

fun main() {
    println("""PIZZA MENU

    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian 
            
    Choose your pizza (a-d): 
            
    """)


    val input = readLine()

    if (input in listOf("a", "b", "c", "d")) {
        println("Order Accepted")
    } else {
        println("Invalid input. Please enter a valid option (a-d).")
    }
}
