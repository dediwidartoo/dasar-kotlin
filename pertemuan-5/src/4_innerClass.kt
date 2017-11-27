class Luar{
    val varLuar = 2

    fun cetakLuar(){
        println("Cetak luar...")
    }

    class Dalam {
        val varDalam = 1

        fun cetakDalam(){
            println("Cetak dalam...")
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar()
    val b = Luar.Dalam()


    println("var Luar  = ${a.varLuar}")
    println("var Dalam = ${b.varDalam}")
}