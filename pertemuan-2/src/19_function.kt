fun sum(n1:Double, n2:Double):Double{
    var sum=n1+n2
    return sum
}

fun main(args: Array<String>) {
    var r= sum(10.0, 12.0)
    println("r: $r")

    r= sum(5.0, 82.0)
    println("r: $r")

    r= sum(110.0, 112.0)
    println("r: $r")
}