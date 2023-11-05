package com.fourtk.academy.marketplaceservice.mappers

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import com.fourtk.academy.marketplaceservice.entities.Category
import org.springframework.stereotype.Component

@Component
class CategoryMapper :Mapper<Category, CategoryDTO> {
    override fun map(t: Category): CategoryDTO {
        return CategoryDTO(
            id = t.id,
            name = t.name
        )
    }
}
