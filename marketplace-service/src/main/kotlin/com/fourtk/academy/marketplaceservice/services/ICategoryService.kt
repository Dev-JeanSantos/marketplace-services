package com.fourtk.academy.marketplaceservice.services

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import org.springframework.http.ResponseEntity

interface ICategoryService {
    fun createCategory(categoryDTO: CategoryDTO): CategoryDTO
    fun getCategoryByName(nameCategory: String): CategoryDTO

}
