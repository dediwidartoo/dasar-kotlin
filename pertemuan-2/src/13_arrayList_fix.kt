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

    arraylist.set(0, " Teknik Informatika")

    println("all element by index")
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //search
    if (arraylist.contains("Mahbub")){
        println("name is found")
    }else{
        println("name is not found")
    }
}