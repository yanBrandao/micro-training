package br.com.woodriver.adapter.input.web.api

import br.com.woodriver.adapter.input.web.request.AuthorRequest
import io.micronaut.http.HttpResponse

interface AuthorAPI {
    fun create(request: AuthorRequest)
    fun getAuthors(email: String): HttpResponse<Any>
}