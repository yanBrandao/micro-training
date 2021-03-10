package br.com.woodriver.adapter.output.repository.entity

import javax.persistence.*

@Entity
@Table(name = "POC_AUTHOR")
data class AuthorEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val email: String = "",
    val description: String = ""
)