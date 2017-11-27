/*
Lakukan looping sebanyak 5 kali,
tapi cetak hanya angka 2 dan 3 saja!
*/

fun main(args: Array<String>) {
    for (item in 1..5)
        if (item == 2 || item == 3)
            println(item)
}