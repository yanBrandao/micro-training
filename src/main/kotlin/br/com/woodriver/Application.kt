package br.com.woodriver

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("br.com.woodriver")
        .start()
}

