package br.com.woodriver.application.input.usecase

import br.com.woodriver.application.input.domain.Author

interface AuthorUseCase {
    fun create(request: Author): Author
}