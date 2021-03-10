package br.com.woodriver.adapter.extension

import br.com.woodriver.adapter.input.web.request.AuthorRequest
import br.com.woodriver.adapter.input.web.response.AuthorResponse
import br.com.woodriver.adapter.output.repository.entity.AuthorEntity
import br.com.woodriver.application.input.domain.Author

fun AuthorRequest.toDomain(): Author =
    Author(email = this.email,
        name = this.name,
        description = this.description
    )

fun Author.toEntity(): AuthorEntity =
    AuthorEntity(email = this.email,
        name = this.name,
        description = this.description
    )

fun AuthorEntity.toDomain(): Author =
    Author(email = this.email,
        name = this.name,
        description = this.description
    )

fun Author.toResponse(): AuthorResponse =
    AuthorResponse(email = this.email,
        name = this.name,
        description = this.description
    )