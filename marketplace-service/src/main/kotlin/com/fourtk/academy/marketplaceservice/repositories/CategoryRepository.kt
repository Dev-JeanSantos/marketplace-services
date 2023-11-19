package com.fourtk.academy.marketplaceservice.repositories

import com.fourtk.academy.marketplaceservice.entities.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.lang.Nullable
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {
    @Nullable
    @Query("SELECT obj FROM Category obj WHERE obj.name = :name")
    fun findByCategoryName(name: String): Category
}