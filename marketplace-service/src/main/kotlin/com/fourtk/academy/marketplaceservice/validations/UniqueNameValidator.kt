package com.fourtk.academy.marketplaceservice.validations

import com.fourtk.academy.marketplaceservice.repositories.CategoryRepository
import org.springframework.stereotype.Service
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

@Service
class UniqueNameValidator(
    private val repository: CategoryRepository
) : ConstraintValidator<UniqueNameValid, String> {

    override fun initialize(constraintAnnotation: UniqueNameValid) {
        super.initialize(constraintAnnotation)
        println("name validator initialize....")
    }

    override fun isValid(name: String, context: ConstraintValidatorContext?): Boolean {

        if (name == null) {
            return false
        }

        val category = repository.findByCategoryName(name)
        if (category != null) {
        context?.buildConstraintViolationWithTemplate(name)
            return false
        }
        return true
    }
}

