class Luar2{
    val varLuar = 2

    fun cetakLuar(){
        println("Cetak luar...")
    }

    inner class Dalam {
        val varDalam = 1

        fun cetakDalam(){
            println("Cetak dalam...")
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar2()
    val b = Luar2().Dalam()


    println("var Luar  = ${a.varLuar}")
    println("var Dalam = ${b.varDalam}")

    b.cetakDalam()
}