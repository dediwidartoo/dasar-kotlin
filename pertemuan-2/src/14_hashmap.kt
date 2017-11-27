fun main(args: Array<String>) {
    var map=HashMap<Int, String>()
    map.put(1,"Dedi")
    map.put(2,"Widarto")
    map.put(33,"Welahan")
    println(map.get(33))

    map.put(33,"Unisnu Jepara")
    for (i in map.keys){
        println(map.get(i))
    }
}