enum class Arah{
    UTARA, BARAT, TIMUR, SELATAN
}

fun main(args: Array<String>) {
    var arahBudi = Arah.TIMUR

    if (arahBudi == Arah.UTARA){
        println("Toni pergi ke arah utara")
    } else {
        println("Toni hilang...")
    }
}