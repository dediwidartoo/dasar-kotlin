import java.io.FileWriter
import java.io.FileReader

fun write(str: String){
    try {
        var fo = FileWriter("src/test.txt", true)
        fo.write(str)
        fo.close()
    } catch (err: Exception){
        println(err.message)
    }
}

fun read(){
    try {
        var fin = FileReader("src/test.txt")
        var c:Int
        do {
            c = fin.read()
            print(c.toChar())
        } while (c!=-1)
    } catch (err: Exception){
        println(err.message)
    }
}

fun writes(){
    print("Masukkan teks : ")
    val input = readLine()!!
    write(input)
    println()
}

fun reads(){
    readFile()
    println()
}

fun main(args: Array<String>) {
    println("Program read-write")
    do {
        println("pilih salah satu action dibawah :")
        println("1. Write File")
        println("2. Read File")
        println("3. Keluar")
        print("Pilih : ")
        val op = readLine()!!.toInt()

        if (op<3)
            when(op){
                1->writes()
                2->reads()
            }
        else if (op == 3) {
            println("Terimakasih telah menggunakan program ini")
            System.exit(0)
        } else
            println("Inputan tidak terdaftar")
    } while (true)
}