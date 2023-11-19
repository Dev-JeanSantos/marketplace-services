package com.fourtk.academy.marketplaceservice.dtos

import com.fourtk.academy.marketplaceservice.validations.UniqueNameValid
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CategoryDTO(
    val id: Long?,
    @field:NotEmpty(message = "Required field")
    @field:Size(min = 3, max = 30, message = "Field requires 3 to 30 characters")
    @field:UniqueNameValid(message = "category name already exists")
    val name: String
)