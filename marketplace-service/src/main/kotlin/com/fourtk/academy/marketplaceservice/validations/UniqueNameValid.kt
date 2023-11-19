package com.fourtk.academy.marketplaceservice.validations

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Target(
    AnnotationTarget.FUNCTION, AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.PROPERTY_GETTER
)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [UniqueNameValidator::class])
@MustBeDocumented
annotation class UniqueNameValid(
    val message: String = "validation error",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<Payload>> = []
)