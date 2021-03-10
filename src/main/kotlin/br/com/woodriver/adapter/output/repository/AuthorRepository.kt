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
}