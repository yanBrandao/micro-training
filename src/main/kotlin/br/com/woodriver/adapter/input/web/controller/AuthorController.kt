package br.com.woodriver.adapter.input.web.controller

import br.com.woodriver.adapter.extension.toDomain
import br.com.woodriver.adapter.extension.toResponse
import br.com.woodriver.adapter.input.web.api.AuthorAPI
import br.com.woodriver.adapter.input.web.request.AuthorRequest
import br.com.woodriver.application.input.usecase.AuthorUseCase
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/authors")
class AuthorController(val authorUseCase: AuthorUseCase): AuthorAPI {

    @Post
    override fun create(@Body @Valid request: AuthorRequest) {
        println("Starting to save author with name ${request.name}")
        val response = authorUseCase.create(request.toDomain()).toResponse()
        println("Done to save author with name ${response.name}")
    }
}