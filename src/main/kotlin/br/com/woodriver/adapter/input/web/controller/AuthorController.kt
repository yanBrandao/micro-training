package br.com.woodriver.adapter.input.web.controller

import br.com.woodriver.adapter.extension.toDomain
import br.com.woodriver.adapter.extension.toResponse
import br.com.woodriver.adapter.input.web.api.AuthorAPI
import br.com.woodriver.adapter.input.web.request.AuthorRequest
import br.com.woodriver.adapter.input.web.response.AuthorResponse
import br.com.woodriver.application.input.usecase.AuthorUseCase
import io.micronaut.data.exceptions.EmptyResultException
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/authors")
class AuthorController(val authorUseCase: AuthorUseCase): AuthorAPI {

    @Post
    override fun create(@Body @Valid request: AuthorRequest): HttpResponse<AuthorResponse> {
        println("Starting to save author with name ${request.name}")
        return HttpResponse.ok(
            authorUseCase.create(request.toDomain()).toResponse().apply {
                println("Done to save author with name ${this.name}")
            }
        )
    }

    @Get
    override fun getAuthors(@QueryValue(defaultValue = "") email: String): HttpResponse<Any> {
        return try {
            HttpResponse.ok(
                when (email.isEmpty()) {
                    true -> authorUseCase.findAuthors().map { it.toResponse() }
                    false -> authorUseCase.findAuthorByEmail(email).toResponse()
                }
            )
        } catch (empty: EmptyResultException) {
            HttpResponse.notFound(empty.message)
        }
    }

    @Put("/{id}")
    override fun updateAuthor(id: Int, request: AuthorRequest): HttpResponse<Any> {
        return try {
            HttpResponse.ok(
                authorUseCase.updateAuthor(id, request.toDomain()).toResponse()
            )
        } catch (empty: EmptyResultException) {
            HttpResponse.notFound(empty.message)
        }
    }

}