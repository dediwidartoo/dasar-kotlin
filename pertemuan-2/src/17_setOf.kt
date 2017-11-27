fun main(args: Array<String>) {
    //setOf tidak bisa menambahkan data lagi (statis)
    var setEmenet= setOf(1,2,3,11,44,55,55)
    for (element in setEmenet){
        println(element)
    }
}