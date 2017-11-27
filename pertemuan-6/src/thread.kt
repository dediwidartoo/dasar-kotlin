class thread(var threadName: String): Thread(){
    init {
        println("$threadName is started")
    }

    override fun run() {
        //write thread
        var count = 0
        while (count<10){
            println("$threadName count $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (ex : Exception){
                println(ex.message)
            }
        }
    }
}

fun main(args: Array<String>) {
    var t1= thread("thread1")
    t1.start()

    var t2= thread("thread2")
    t2.start()

    var t3= thread("thread3")
    t3.start()
    t3.join()
    println(" thread is run")
}