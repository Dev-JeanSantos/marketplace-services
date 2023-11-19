package com.fourtk.academy.marketplaceservice.controllers

import com.fourtk.academy.marketplaceservice.dtos.CategoryDTO
import com.fourtk.academy.marketplaceservice.services.impl.CategoryService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/marketing-services/categories")
class CategoryController(
    private val categoryService: CategoryService
    ) {
    private val logger = LoggerFactory.getLogger(this::class.java)
    @PostMapping
    fun createCategory(
        @Valid @RequestBody categoryDTO: CategoryDTO,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<CategoryDTO>{
        logger.info("Start createCategory - Controller")
        val category: CategoryDTO = categoryService.createCategory(categoryDTO)
        val toUri = uriBuilder.path("id").build().toUri()
        logger.info("End createCategory - Controller")
        return ResponseEntity.created(toUri).body(category)
    }

    @GetMapping
    fun getCategoryByName(@RequestParam(required = true) nameCategory: String): ResponseEntity<CategoryDTO>{
        val category = categoryService.getCategoryByName(nameCategory)
        return ResponseEntity.ok().body(category)

    }
}