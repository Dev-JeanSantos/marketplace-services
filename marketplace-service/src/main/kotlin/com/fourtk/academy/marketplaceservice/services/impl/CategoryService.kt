package com.fourtk.academy.marketplaceservice.services.impl

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import com.fourtk.academy.marketplaceservice.mappers.CategoryDTOMapper
import com.fourtk.academy.marketplaceservice.mappers.CategoryMapper
import com.fourtk.academy.marketplaceservice.repositories.CategoryRepository
import com.fourtk.academy.marketplaceservice.services.ICategoryService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CategoryService(
    val categoryRepository: CategoryRepository,
    val categoryDTOMapper: CategoryDTOMapper,
    val categoryMapper: CategoryMapper
) : ICategoryService {
    private val logger = LoggerFactory.getLogger(this::class.java)
    override fun createCategory(categoryDTO: CategoryDTO): CategoryDTO {
        logger.info("Start createCategory - Service")
        val category = categoryDTOMapper.map(categoryDTO)
        val saveCategory = categoryRepository.save(category)
        logger.info("Finalized createCategory - Service")
        return categoryMapper.map(saveCategory)
    }

    override fun getCategoryByName(nameCategory: String): CategoryDTO {
        val possibleCategory = categoryRepository.findByCategoryName(nameCategory)
        return categoryMapper.map(possibleCategory)
    }

}