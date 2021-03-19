package br.com.woodriver.application.output.port

import br.com.woodriver.application.input.domain.Author

interface AuthorPort {
    fun save(author: Author): Author

    fun findAll(): List<Author>

    fun findAuthorByEmail(email: String): Author

    fun findById(id: Int): Author
    fun update(id: Int, author: Author): Author
}