package br.com.onegtwom

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.onegtwom")
		.start()
}

