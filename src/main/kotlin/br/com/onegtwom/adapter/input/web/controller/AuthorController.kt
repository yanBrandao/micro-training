package br.com.onegtwom.adapter.input.web.controller

import br.com.onegtwom.adapter.input.web.api.AuthorAPI
import br.com.onegtwom.adapter.input.web.request.AuthorRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/authors")
class AuthorController: AuthorAPI {

    @Post
    override fun create(@Body request: AuthorRequest) {
        println(request)
    }
}