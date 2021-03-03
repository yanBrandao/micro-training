package br.com.onegtwom.adapter.input.web.api

import br.com.onegtwom.adapter.input.web.request.AuthorRequest

interface AuthorAPI {
    fun create(request: AuthorRequest)
}