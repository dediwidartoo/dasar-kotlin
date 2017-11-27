fun main(args: Array<String>) {
    print("masukkan nama : ")
    var name = readLine()
    print("masukkan umur : ")
    var age:Int = readLine()!!.toInt()
    print("masukkan department : ")
    var department:String?
    department = readLine()

    println("Nama : " + name)
    println("Umur : " + age)
    println("Department : " + department)

    val pi:Double = 3.14
    println("pi : "+pi)
}