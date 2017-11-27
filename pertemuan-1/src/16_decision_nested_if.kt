fun main(args: Array<String>) {
    // Nested IF
    print("Masukkan nilai : ")
    var n = readLine()!!.toDouble()

    if (n>=90)
        if (n>=95)
            println("Kamu dapat nilai A+")
        else
            println("Kamu dapat nilai A-")
    else if (n>=80 && n<90)
        println("Kamu dapat nilai B")
    else if (n>=70 && n<80)
        println("Kamu dapat nilai C")
    else if (n>=60 && n<70)
        println("Kamu dapat nilai D")
    else
        println("Kamu tidak lulus")

    print("Kamu memasukkan nilai $n")
}