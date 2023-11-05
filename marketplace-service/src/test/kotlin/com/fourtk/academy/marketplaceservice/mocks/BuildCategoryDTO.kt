package com.fourtk.academy.marketplaceservice.mocks

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO

object BuildCategoryDTO {
    fun buildCategoryDTOSucesss(
        id: Long = 1L,
        name: String = "CARNES"
    ) = CategoryDTO(
        id = 1L,
        name = name
    )

    fun buildCategoryDTOFailed(
        id: Long = 1L,
        name: String = ""
    ) = CategoryDTO(
        id = 1L,
        name = name
    )
}