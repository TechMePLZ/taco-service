package ru.friend.tacoservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class TestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testController() throws Exception {
        mockMvc.perform(get("/")) // url запроса
                .andExpect(status().isOk()) // mock выполнить запрос по адрессу
                .andExpect(view().name("home")) // ожидается представление view
                .andExpect(content().string(containsString("Welcome to..."))); // ожидается наличие строки

    }

    // банутый тест если честно


}
