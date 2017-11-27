fun main(args: Array<String>) {
    //mutableSetOf bisa menambahkan data lagi (dinamis)
    var setEmenet= mutableSetOf(1,2,3,11,44,55,55)
    setEmenet.add(77)
    for (element in setEmenet){
        println(element)
    }
}