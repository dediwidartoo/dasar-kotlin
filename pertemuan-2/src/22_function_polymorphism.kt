fun show(name:String):Unit{
    println("nama : "+name)
}

fun show(number:Int):Unit{
    println("angka Int : "+number)
}

fun show(numberD:Double):Unit{
    println("angka double : "+numberD)
}

fun main(args: Array<String>) {
    show("Dedi Widarto")
    show(2)
    show(2.5)
}