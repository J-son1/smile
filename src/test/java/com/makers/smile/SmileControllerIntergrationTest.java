package com.makers.smile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class SmileControllerIntergrationTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private SmileRepository smileRepository;

    @Test
    void testSmilesPostCreatesNewSmile() throws Exception {
        smileRepository.save(new Smile(false, true));

        mvc.perform(
            MockMvcRequestBuilders.post("/api/smiles")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"isCrying\": \"false\", \"isLaughing\": \"true\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.isCrying").value("false"))
            .andExpect(jsonPath("$.isLaughing").value("true"));
    
        Smile smile = smileRepository.findFirstByOrderByIdAsc();
        assertEquals(false, smile.getIsCrying());
        assertEquals(true, smile.getIsLaughing());
    }

}
