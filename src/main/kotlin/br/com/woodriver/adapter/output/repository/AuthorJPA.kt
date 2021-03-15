package br.com.woodriver.adapter.output.repository

import br.com.woodriver.adapter.output.repository.entity.AuthorEntity
import br.com.woodriver.application.input.domain.Author
import br.com.woodriver.application.output.port.AuthorPort
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface AuthorJPA: JpaRepository<AuthorEntity, Int> {

    fun findByEmail(email: String): AuthorEntity
}