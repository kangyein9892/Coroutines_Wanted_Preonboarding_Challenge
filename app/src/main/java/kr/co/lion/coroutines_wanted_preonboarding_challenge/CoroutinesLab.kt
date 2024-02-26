package kr.co.lion.coroutines_wanted_preonboarding_challenge

import kotlinx.coroutines.*

/*
suspend fun main() {
    println("Weather forecast")
    delay(1000)
    println("Sunny")
}*/

fun main() {
    runBlocking {
        println("Weather forecast")
        delay(1000)
        println("Sunny")
    }
}
