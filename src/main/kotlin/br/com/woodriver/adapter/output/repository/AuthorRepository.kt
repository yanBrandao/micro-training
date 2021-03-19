package br.com.woodriver.adapter.output.repository

import br.com.woodriver.adapter.extension.toDomain
import br.com.woodriver.adapter.extension.toEntity
import br.com.woodriver.application.input.domain.Author
import br.com.woodriver.application.output.port.AuthorPort
import javax.inject.Singleton

@Singleton
class AuthorRepository(private val authorJPA: AuthorJPA): AuthorPort {
    override fun save(author: Author): Author {
        return authorJPA.save(author.toEntity()).toDomain()
    }

    override fun findAll(): List<Author> {
        return authorJPA.findAll().map {
            it.toDomain()
        }
    }

    override fun findAuthorByEmail(email: String): Author {
        return authorJPA.findByEmail(email).toDomain()
    }

    override fun findById(id: Int): Author {
        return authorJPA.findById(id).get().toDomain()
    }

    override fun update(id: Int, author: Author): Author {
        return authorJPA.update(author.toEntity(id)).toDomain()
    }
}