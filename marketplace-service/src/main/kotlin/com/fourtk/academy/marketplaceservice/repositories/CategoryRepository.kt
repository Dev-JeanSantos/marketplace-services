package com.fourtk.academy.marketplaceservice.repositories

import com.fourtk.academy.marketplaceservice.entities.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Long> {

}
