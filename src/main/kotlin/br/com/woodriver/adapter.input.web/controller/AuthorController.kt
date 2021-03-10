package br.com.woodriver.adapter.input.web.controller

import br.com.woodriver.adapter.input.web.api.AuthorAPI
import br.com.woodriver.adapter.input.web.request.AuthorRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/authors")
class AuthorController: AuthorAPI {

    @Post
    override fun create(@Body @Valid request: AuthorRequest) {
        println(request)
    }
}