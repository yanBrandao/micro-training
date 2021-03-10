package br.com.woodriver.application.output.port

import br.com.woodriver.application.input.domain.Author

interface AuthorPort {
    fun save(author: Author): Author
}