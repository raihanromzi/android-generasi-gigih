import java.util.Date
import kotlin.concurrent.thread
//import kotlinx.coroutines.*


// Thread is Parallel
fun main() {
    // Thread
    val threadName = Thread.currentThread().name
    println("Thread Name $threadName")

    thread(start = true){
        println("Thread Start")
        Thread.sleep(4000)
        println(Date())
    }

    println("Waiting")
    Thread.sleep(3000)
    println(Date())
    println("Done")
}


// Async -> 2 times faster
//fun run() = runBlocking {
//    val capital = async { getCapital() }
//    val income = async { getIncome() }
//    println("Your profit is ${income.await() - capital.await()}")
//}
//
//fun testCoroutine() = runBlocking{
//    launch {
//        delay(1000L)
//        println("Coroutines!")
//    }
//    println("Hello,")
//    delay(2000L)
//}