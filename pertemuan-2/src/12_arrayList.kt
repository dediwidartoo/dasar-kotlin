fun main(args: Array<String>) {
    var arraylist=ArrayList<String>()
    arraylist.add("Dedi")
    arraylist.add("Widarto")
    arraylist.add("Welahan")
    arraylist.add("Jepara")

    println("First name: "+arraylist.get(0))

    println("All element by object")
    for (item in arraylist)
        println(item)
}