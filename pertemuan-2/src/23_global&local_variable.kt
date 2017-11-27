var fullname:String="Dedi Widarto" // fullname = global variable

fun display():Unit{
    println(fullname)
}

fun main(args: Array<String>) {
    var name="local" // name = local variable
    println(fullname)
    println("nama : "+name)
    display()
}