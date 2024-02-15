package au.com.boundless_systems.playground.coroutines

import kotlinx.coroutines.delay

suspend fun someTask(taskTime : Long = 500L) {
    println("some task is running on: ${Thread.currentThread().name}")
    delay(taskTime)
    println("Finishing some task after $taskTime milliseconds")
}

suspend fun networkCall(delayTime : Long = 1000L) {
    println("network call function is running on: ${Thread.currentThread().name}")
    delay(delayTime)
    println("network call done after $delayTime milliseconds")
}