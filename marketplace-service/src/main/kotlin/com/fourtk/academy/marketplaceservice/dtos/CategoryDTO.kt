package com.fourtk.academy.marketplaceservice.dtos

import javax.validation.constraints.*

data class CategoryDTO(

    val id: Long?,

    @field:NotEmpty(message = "Required field")
    @field:Size(min = 3, max = 30, message = "Field requires 3 to 30 characters")
    val name: String
)