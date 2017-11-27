class Luar4{
    val varLuar = 1

    fun cetakLuar(){
        println("Cetak luar...")
    }

    class Dalam {
        val varDalam = 2

        fun cetakDalam(){
            println("Cetak dalam...")
        }

        class Terdalam {
            val varTerdalam = 3

            fun cetakTerdalam(){
                println("Cetak pedalaman...")
            }
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar4()
    val b = Luar4.Dalam()
    val c = Luar4.Dalam.Terdalam()


    a.cetakLuar()
    b.cetakDalam()
    c.cetakTerdalam()
}