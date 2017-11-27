import java.io.FileReader

fun main(args: Array<String>) {
    readFile()
}

fun readFile(){
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

