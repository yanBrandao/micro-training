package br.com.woodriver.adapter.input.web.api

import br.com.woodriver.adapter.input.web.request.AuthorRequest
import br.com.woodriver.adapter.input.web.response.AuthorResponse
import io.micronaut.http.HttpResponse

interface AuthorAPI {
    fun create(request: AuthorRequest): HttpResponse<AuthorResponse>
    fun getAuthors(email: String): HttpResponse<Any>
    fun updateAuthor(id: Int, request: AuthorRequest): HttpResponse<Any>
}