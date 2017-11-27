import java.io.FileWriter

fun main(args: Array<String>) {
    writeFile("Dediwidarto")
}

fun writeFile(str: String){
    try {
        var fo = FileWriter("src/test.txt", true)
        fo.write(str)
        fo.close()
    } catch (err: Exception){
        println(err.message)
    }
}