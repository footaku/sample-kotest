package com.example.footaku.sample.kotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotestListenersApplication

fun main(args: Array<String>) {
    runApplication<KotestListenersApplication>(*args)
}
