fun main(args: Array<String>) {
    println("Operasi matematika")
    print("Masukkan n1 : ")
    var n1:Float= readLine()!!.toFloat()
    print("Masukkan n2 : ")
    var n2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum=n1+n2
    println("Hasil : $sum")
    //atau println("Hasil : "+sum)
}