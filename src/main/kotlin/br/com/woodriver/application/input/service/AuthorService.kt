package br.com.woodriver.application.input.service

import br.com.woodriver.application.input.domain.Author
import br.com.woodriver.application.input.usecase.AuthorUseCase
import br.com.woodriver.application.output.port.AuthorPort
import javax.inject.Singleton

@Singleton
class AuthorService(private val authorPort: AuthorPort): AuthorUseCase {
    override fun create(author: Author): Author {
        return author.save(authorPort)
    }

    override fun findAuthors(): List<Author> {
        return authorPort.findAll()
    }

    override fun findAuthorByEmail(email: String): Author {
        return authorPort.findAuthorByEmail(email)
    }
}