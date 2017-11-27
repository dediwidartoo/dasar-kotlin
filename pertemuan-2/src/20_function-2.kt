fun display(n:Int=0):Unit{
    println("n: $n")
}

fun displayNotInput():Unit{
    println("Welcome to display")
}

fun main(args: Array<String>) {
    display(10)
    display()
    displayNotInput()
}