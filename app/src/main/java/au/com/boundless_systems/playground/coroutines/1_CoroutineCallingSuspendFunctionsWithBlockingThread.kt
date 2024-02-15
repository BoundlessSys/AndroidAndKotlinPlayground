package au.com.boundless_systems.playground.coroutines

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("main function is running on: ${Thread.currentThread().name}")
    val startTime = System.currentTimeMillis()
    //---------------------------------------

    // Simulate some tasks done on the main thread that the result is
    // not important
    someTask()

    // Call network that result is important
    networkCall()

    //---------------------------------------
    val endTime = System.currentTimeMillis()
    println("Exiting main after execution time of ${endTime - startTime}")
}

