class Hitung(val angka1:Double, val angka2: Double){
    var hasil = 0.0

    fun penjumlahan() {
        hasil = angka1 + angka2
        println("Hasil : $hasil")
    }

    fun pengurangan() {
        hasil = angka1 - angka2
        println("Hasil : $hasil")
    }

    fun pembagian() {
        try {
            hasil = angka1 / angka2
            println("Hasil : $hasil")
        }
        catch (err: Exception){
            println(err.message)
        }
    }

    fun perkalian() {
        try {
            hasil = angka1 * angka2
            println("Hasil : $hasil")
        }
        catch (err: Exception){
            println(err.message)
        }
    }
}

fun main(args: Array<String>) {
    do {
        println()
        println("Pilih Operasi :")
        println("1. Penjumlahan")
        println("2. Pengurangan")
        println("3. Pembagian")
        println("4. Perkalian")
        println("5. Keluar")
        println()

        print("Operasi : ")
        val op = readLine()!!.toInt()

        if (op < 5) {
            print("Masukkan angka pertama : ")
            val n1 = readLine()!!.toDouble()
            print("Masukkan angka kedua   : ")
            val n2 = readLine()!!.toDouble()
            println()

            val hitung = Hitung(n1, n2)
            when (op) {
                1 -> hitung.penjumlahan()
                2 -> hitung.pengurangan()
                3 -> hitung.pembagian()
                4 -> hitung.perkalian()
            }
        }else if (op == 5){
            println()
            println("Matur suwun nggih...")
            System.exit(0)
        }
        else{
            println()
            println("Ngapuntene, ongko ora kedaftar bosss")
        }
    }
    while (true)
}
