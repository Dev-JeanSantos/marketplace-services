package com.fourtk.academy.marketplaceservice.services

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO

interface ICategoryService {
    fun createCategory(categoryDTO: CategoryDTO): CategoryDTO

}
