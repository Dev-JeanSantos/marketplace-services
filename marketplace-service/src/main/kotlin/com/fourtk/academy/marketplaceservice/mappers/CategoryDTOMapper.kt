package com.fourtk.academy.marketplaceservice.mappers

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import com.fourtk.academy.marketplaceservice.entities.Category
import org.springframework.stereotype.Component

@Component
class CategoryDTOMapper : Mapper<CategoryDTO, Category>{
    override fun map(t: CategoryDTO): Category {
        return Category(
            id = t.id,
            name = t.name
        )
    }

}
