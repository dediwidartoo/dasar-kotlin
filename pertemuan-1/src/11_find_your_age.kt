import java.util.*
fun main(args: Array<String>) {
    //input
    print("Masukkan tahun lahirmu : ")
    var t_lahir:Int= readLine()!!.toInt()

    //process
    var tahun=Calendar.getInstance().get(Calendar.YEAR)
    var umur:Int?
    umur = tahun-t_lahir

    //output
    println("Your age is $umur years")
}