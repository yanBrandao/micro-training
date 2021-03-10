package br.com.woodriver.adapter.input.web.api

import br.com.woodriver.adapter.input.web.request.AuthorRequest

interface AuthorAPI {
    fun create(request: AuthorRequest)
}