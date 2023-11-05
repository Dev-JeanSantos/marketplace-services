package com.fourtk.academy.marketplaceservice.entities

import javax.persistence.*

@Entity
@Table(name = "tb_category")
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String = ""
)