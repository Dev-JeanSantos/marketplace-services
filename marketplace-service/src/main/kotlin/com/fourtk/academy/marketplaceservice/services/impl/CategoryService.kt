package com.fourtk.academy.marketplaceservice.services.impl

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import com.fourtk.academy.marketplaceservice.mappers.CategoryDTOMapper
import com.fourtk.academy.marketplaceservice.mappers.CategoryMapper
import com.fourtk.academy.marketplaceservice.repositories.CategoryRepository
import com.fourtk.academy.marketplaceservice.services.ICategoryService
import org.springframework.stereotype.Service

@Service
class CategoryService(
    val categoryRepository: CategoryRepository,
    val categoryDTOMapper: CategoryDTOMapper,
    val categoryMapper: CategoryMapper
) : ICategoryService {
    override fun createCategory(categoryDTO: CategoryDTO): CategoryDTO {
        val category = categoryDTOMapper.map(categoryDTO)
        val saveCategory = categoryRepository.save(category)
        return categoryMapper.map(saveCategory)
    }

}