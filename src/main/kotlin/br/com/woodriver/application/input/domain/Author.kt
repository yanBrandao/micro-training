package br.com.woodriver.application.input.domain

import br.com.woodriver.application.output.port.AuthorPort

data class Author(
    val name: String = "",
    val email: String = "",
    val description: String = ""
) {
    fun save(authorPort: AuthorPort): Author {
        return authorPort.save(this)
    }
}