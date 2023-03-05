package com.tk16.microsrevices.microserviceone.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tk16.microsrevices.microserviceone.core.AuthorFacade;
import com.tk16.microsrevices.microserviceone.core.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AuthorController.class)
class AuthorControllerTest {
    @MockBean AuthorFacade facade;
    @Autowired MockMvc mockMvc;
    @Autowired ObjectMapper objectMapper;

    @Test
    void addAuthor() throws Exception {
        Author requestAuthor = new Author(1, "Tushar Kalra");
        when(facade.addToAuthors(requestAuthor))
                .thenReturn(requestAuthor);
        mockMvc.perform(
                        post("/admin/author")
                                .content(objectMapper.writeValueAsString(requestAuthor))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpectAll(
                        status().isCreated(),
                        content().contentType(MediaType.APPLICATION_JSON_VALUE),
                        jsonPath("$.authorId").exists()
                );
    }
}