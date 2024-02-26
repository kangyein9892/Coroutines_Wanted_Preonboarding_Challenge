package kr.co.lion.coroutines_wanted_preonboarding_challenge

import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecast()
            }
            launch {
                printTemperature()
            }
            println("Have a good day!") // fire-and-forget (실행 후 무시)
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}

/*
suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}*/