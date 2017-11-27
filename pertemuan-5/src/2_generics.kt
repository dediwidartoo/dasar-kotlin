class Person<T>(name: T){
    init {
        println(name)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main(args: Array<String>) {
    var Agus = Person<String>("Ini Agus")
    var Budi = Person<Int>(12)
    var Cika = Person<Double>(213.5)

    display<Int>(123)
    display<String>("Proses person")
}