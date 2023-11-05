package com.fourtk.academy.marketplaceservice.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import com.fourtk.academy.marketplaceservice.mocks.BuildCategoryDTO
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ContextConfiguration()
@ExtendWith(SpringExtension::class)
public class CategoryControllerTest{

    @Autowired
    private  lateinit var mockMvc: MockMvc

    @Autowired
    private  lateinit var objectMapper: ObjectMapper

    companion object{
        const val URL: String = "/api/v1/marketing-services/categories"
    }

    @Test
    @DisplayName("should create a category and return 201 status")
    fun `should create a category and return 201 status`(){
        val categoryDTO = BuildCategoryDTO.buildCategoryDTOSucesss()
        val asString = objectMapper.writeValueAsString(categoryDTO)
        println(asString)

        mockMvc.perform(
            MockMvcRequestBuilders.post(URL)
                .contentType(APPLICATION_JSON)
                .content(asString)
        )
            .andExpect(MockMvcResultMatchers.status().isCreated)
            .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1L))
            .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("CARNES"))
            .andDo(MockMvcResultHandlers.print())
    }

}