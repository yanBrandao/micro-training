package br.com.woodriver.application.input.service

import br.com.woodriver.application.input.domain.Author
import br.com.woodriver.application.input.usecase.AuthorUseCase
import br.com.woodriver.application.output.port.AuthorPort
import javax.inject.Singleton

@Singleton
class AuthorService(private val authorPort: AuthorPort): AuthorUseCase {
    override fun create(request: Author): Author {
        return authorPort.save(request)
    }
}