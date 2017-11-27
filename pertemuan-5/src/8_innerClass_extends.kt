interface InterfaceDalam{
    fun cetakTerdalam()
}


class Luar5{
    val varLuar = 1

    fun cetakLuar(){
        println("Cetak luar...")
    }

    inner class Dalam {
        val varDalam = 2

        fun cetakDalam(){
            val varLuar = 10
            cetakLuar()
            println("Cetak dalam...")
        }

        inner class Terdalam : InterfaceDalam{
            val varTerdalam = 3
            override fun cetakTerdalam(){
                println("cetak terdalam...")
            }
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar5()
    val b = a.Dalam()
    val c:InterfaceDalam = b.Terdalam()


    a.cetakLuar()
    b.cetakDalam()
    c.cetakTerdalam()
}