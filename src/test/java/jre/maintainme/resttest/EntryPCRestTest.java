package jre.maintainme.resttest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class EntryPCRestTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCorrectAuthentication() throws Exception {
        // Testing authentication with correct details
        this.mockMvc.perform(
            MockMvcRequestBuilders.get("/login")
            .content("{\"username\":\"admin\",\"password\":\"pixeltronic\"}"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().isOk()
        );
    }

    @Test
    public void testIncorrectAuthentication() throws Exception {
        // Testing authentication with wrong details
        this.mockMvc.perform(
            MockMvcRequestBuilders.get("/login")
            .content("{\"username\":\"admin\", \"password\":\"wrong\"}"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().is4xxClientError()
        );
    }
}
