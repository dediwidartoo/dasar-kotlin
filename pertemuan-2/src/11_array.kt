// one dimension array

fun main(args: Array<String>) {
    var arrayInt = Array<Int>(size = 5){0}
    arrayInt[3] = 55
    println("Array ke -3 = $arrayInt[3]")

    println("All element by Object")
    for (element in arrayInt){
        println(element)
    }

    println("All element by index")
    for (index in 0..4){
        println(arrayInt[index])
    }

    var arrayStr = Array<String>(size = 4){""}
    for (index in 0..3){
        print("ArrayStr[$index]=")
        arrayStr[index] = readLine()!!

        for (index in 0..3){
            println("arrayStr[$index]"+ arrayStr[index])
        }
    }
}