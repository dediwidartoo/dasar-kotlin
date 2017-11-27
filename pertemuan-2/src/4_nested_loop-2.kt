fun main(args: Array<String>) {
    for (i in 1..5){
        for (y in i..4)
            print(" ")
        for (x in 1..i)
            print("*")
        println()
    }
}