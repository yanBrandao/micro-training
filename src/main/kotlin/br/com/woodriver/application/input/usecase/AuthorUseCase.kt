package br.com.woodriver.application.input.usecase

import br.com.woodriver.application.input.domain.Author

interface AuthorUseCase {
    fun create(author: Author): Author

    fun findAuthors(): List<Author>

    fun findAuthorByEmail(email: String): Author

    fun updateAuthor(id: Int, author: Author): Author
}