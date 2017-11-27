class Luar3{
    val varLuar = 2

    fun cetakLuar(){
        println("Cetak luar...")
    }

    inner class Dalam {
        val varDalam = 1

        fun cetakDalam(){
            println("Cetak dalam...")
            println("Cetak luar dari dalam : $varLuar")
            cetakLuar()
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar3()
    val b = Luar3().Dalam()


    println("var Luar  = ${a.varLuar}")
    println("var Dalam = ${b.varDalam}")

    b.cetakDalam()
}