fun main(args: Array<String>) {
    // IF-Else
    print("Masukkan nilai : ")
    var n = readLine()!!.toDouble()

    if (n>=90)
        println("Kamu dapat nilai A")
    else
        println("Kamu tidak termasuk kategori nilai A")

    print("Kamu memasukkan nilai $n")
}