package com.example.hatr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HatrWebApplication

fun main(args: Array<String>) {
    runApplication<HatrWebApplication>(*args)
}
