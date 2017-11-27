fun main(args: Array<String>) {
    // when
    print("Masukkan nilai : ")
    var n = readLine()!!.toInt()

    when (n){
        100         -> println("Kamu dapat nilai sempurna!")
        98,99       -> println("Nyaris sempurna, nilai anda 98 atau 99")
        in 95..97   -> println("Kamu dapat nilai A+")
        in 90..94   -> println("Kamu dapat nilai A-")
        in 80..89   -> println("Kamu dapat nilai B")
        in 70..79   -> println("Kamu dapat nilai C")
        in 0..69    -> println("Kamu tidak lulus")
        !in 0..100  -> println("Inputan diluar range nilai!!!")
    }
}